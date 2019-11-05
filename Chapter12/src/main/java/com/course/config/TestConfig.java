package com.course.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.client.CookieStore;

public class TestConfig {
    //定义接口的url变量名
    public static String loginUrl;
    public static String updateUserInfoUrl;
    public static String getUserListUrl;
    public static String getUserInfoUrl;
    public static String addUserUrl;

    public static CookieStore store;
    public static DefaultHttpClient defaultHttpClient;

}
