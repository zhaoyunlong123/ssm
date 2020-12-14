package com.javakc.ssm.user.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {

    private String id; //编号
    private	String name; //姓名
    private	int age; //年龄
    private	int gender; //性别
    private	String phone; //电话
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date birthday; //生日
    private	String address; //住址


}
