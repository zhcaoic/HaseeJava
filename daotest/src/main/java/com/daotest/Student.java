package com.daotest;


import lombok.Getter;
import lombok.Setter;
import java.util.Date;

public class Student {

    @Getter @Setter private int id;

    @Getter @Setter private String studentId;

    @Getter @Setter private String studentName;

    @Getter @Setter private String studentAddress;

    @Getter @Setter private Date createTime;

    @Getter @Setter private Date updateTime;

    

}
