package com.course.httpclient.demo;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DecompressingHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

@Test
public class MyHttpClient {

    public void test1() throws IOException {
        String result;
        HttpGet get = new HttpGet("http://baidu.com");
        HttpClient client = new DecompressingHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result.toString());

    }
}