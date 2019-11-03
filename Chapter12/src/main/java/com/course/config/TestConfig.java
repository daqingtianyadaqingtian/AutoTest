package com.course.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.client.CookieStore;

public class TestConfig {
    public static String loginUrl;
    public static CookieStore store;
    public static DefaultHttpClient defaultHttpClient;
}
