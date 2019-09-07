package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;

public class GroupsOnMethod {
/**
    @Test(groups = "server")
    public void test1(){
        System.out.println("这个是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这个是服务端组的测试方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这个是客户端组的测试方法1");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这个是客户端组的测试方法2");
    }

    @BeforeGroups("server")
    public void befordGroupsOnServer(){
        System.out.println("这是服务端运行之前的运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsServer(){
        System.out.println("这是服务端运行结束时运行的方法");
    }

    @BeforeGroups("client")
    public void befordGroupsOnClent(){
        System.out.println("这是客户端运行之前的运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsClient(){
        System.out.println("这是客户端运行结束时运行的方法");
    }

    **/
}
