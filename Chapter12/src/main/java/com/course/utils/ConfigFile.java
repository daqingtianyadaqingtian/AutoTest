package com.course.utils;


import com.course.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    private  static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    public static String getUrl(InterfaceName name){
        String adddress = bundle.getString("test.url");
        String uri = "";
        //最终的测试地址
        String testUrl;

        if(name == InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }

        if(name == InterfaceName.ADDUSER){
            uri = bundle.getString("addUser.uri");
        }

        testUrl = adddress + uri;

        return testUrl;
    }

}
