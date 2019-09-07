package com.course.testng.suite;

import org.testng.annotations.Test;

public class LoginTest {
    @Test(enabled = false)
    public void loginTaoBao(){
        System.out.println("淘宝登录成功");
    }
}
