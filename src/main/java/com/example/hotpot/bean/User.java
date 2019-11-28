package com.example.hotpot.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "user")
public class User {
    @Column(name = "id")
    private Long id;
    @Column(name = "open_id")
    private String openId;

    @Column(name = "weixin_name")
    private String weiXinName;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private String creatTime;

    @Column(name = "jifeng")
    private String jifeng;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "phone")
    private String phone;
}
