package com.course.model;

import lombok.Data;

@Data
public class AddUserCase {
    private String userName;
    private String passWord;
    private int sex;
    private int age;
    private int permission;
    private int isDelete;
    private String expected;

}
