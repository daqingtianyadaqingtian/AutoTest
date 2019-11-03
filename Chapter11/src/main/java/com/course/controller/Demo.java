package com.course.controller;


import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@Api(value = "v1",description = "这是我的第一个版本的demo")
@RequestMapping("v1")
public class Demo {

    //首先获取第一个执行sql的语句对象

    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value="可以获取到用户数",httpMethod = "GET")
    public int getUserCount(){
        return  template.selectOne("getUserCount");

    }



    //添加一个用户
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody  User user){
        int result = template.insert("addUser",user);
        return  result;
    }

    //更新
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)

    public int  updateUser(@RequestBody User user){
        return template.update("updateUser",user);
    }

    //删除
    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    //注意如果传递的参数为简单数值 不是json等对象 用的是requestParam；否则用上面的requestBody
    public int  deleteUser(@RequestParam int id){
        return template.delete("deleteUser",id);
    }

}
