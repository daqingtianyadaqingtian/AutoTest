package com.course.testng;

import org.testng.annotations.Test;

public class ExectedException {
    /**
     * 捕捉到了异常但是未抛出
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runtIMException(){
        System.out.println("失败异常的测试数据");
    }

    /**
     * 捕捉到了异常的数据，将其抛出
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runtIMException2(){
        System.out.println("失败异常的测试数据");
        throw new RuntimeException();
    }

}
