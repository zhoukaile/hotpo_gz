package com.example.hotpot.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    private long id;
    @Column(name = "open_id")
    private String openId;

    @Column(name = "weixin_name")
    private String weiXinName;

    @Column(name = "sex")
    private String sex;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "status")
    private String status;

    @Column(name = "creat_time")
    private String creatTime;

    @Column(name = "jifeng")
    private String jifeng;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "phone")
    private String phone;

}
