package com.course.cases;

import com.course.config.TestConfig;
import com.course.model.AddUserCase;
import com.course.model.InterfaceName;
import com.course.model.User;
import com.course.utils.ConfigFile;
import com.course.utils.DatabaseUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddUserTest {

    @Test(dependsOnGroups = "loginTrue" ,description = "添加用户接口测试")
    public void addUser() throws IOException, InterruptedException, JSONException {
        SqlSession session = DatabaseUtil.getSqlSession();
        AddUserCase addUserCase = session.selectOne("addUserCase",1);
        System.out.printf(addUserCase.toString());
        System.out.println(TestConfig.addUserUrl);

        //发请求，获取结果
        String result = getResult(addUserCase);
        //验证返回结果

        Thread.sleep(5000);

        //       System.out.println(user.toString());
        Assert.assertEquals(addUserCase.getExpected(),result);
    }

    private String getResult(AddUserCase addUserCase) throws JSONException, IOException {
        HttpPost post = new HttpPost(TestConfig.addUserUrl);
        JSONObject  param = new JSONObject();
        param.put("userName",addUserCase.getUserName());
        param.put("age",addUserCase.getAge());
        param.put("expected",addUserCase.getExpected());
        param.put("isDelete",addUserCase.getIsDelete());
        param.put("passWord",addUserCase.getPassWord());
        param.put("sex",addUserCase.getSex());
        param.put("permission",addUserCase.getPermission());
        post.setHeader("content-type","application/json");

        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);

        TestConfig.defaultHttpClient.setCookieStore(TestConfig.store);
        String result;
        HttpResponse response = TestConfig.defaultHttpClient.execute(post);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        return result;

    }

}
