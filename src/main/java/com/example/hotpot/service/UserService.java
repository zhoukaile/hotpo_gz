package com.example.hotpot.service;

import com.example.hotpot.bean.User;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

public interface UserService {

    void insertUser(WxMpUser wxMpUser);

    User quryByOpenId(String openId);

    void updateStateById(String openId,int status);
}
