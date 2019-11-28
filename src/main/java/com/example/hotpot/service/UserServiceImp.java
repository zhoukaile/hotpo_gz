package com.example.hotpot.service;

import com.example.hotpot.bean.User;
import com.example.hotpot.comment.UIDWorker;
import com.example.hotpot.mapper.WxUserMapper;
import com.example.hotpot.utils.TimesUtils;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    WxUserMapper wxUserMapper;


    @Override
    public void insertUser(WxMpUser wxMpUser) {
        //先去查一下
        User user = quryByOpenId(wxMpUser.getOpenId());
        if (null != user) {
            //修改状态为0
            wxUserMapper.updateStateByOpenID(user.getOpenId(), 0);
            return;
        }
        //再存
        User newUser = new User();
        newUser.setCity(wxMpUser.getCity());
        newUser.setCreatTime(TimesUtils.getNowTimeByFormat("yyyy-MM-dd HH:mm:ss"));
        newUser.setOpenId(wxMpUser.getOpenId());
        newUser.setProvince(wxMpUser.getProvince());
        newUser.setSex(wxMpUser.getSex());
        newUser.setStatus(0);
        newUser.setWeiXinName(wxMpUser.getNickname());
        UIDWorker uidWorker = new UIDWorker(123);
        newUser.setId(uidWorker.nextId());
        wxUserMapper.insert(newUser);
    }

    @Override
    public User quryByOpenId(String openId) {
        return wxUserMapper.selectUserByOpenId(openId);
    }

    @Override
    public void updateStateById(String openId, int status) {
        wxUserMapper.updateStateByOpenID(openId, status);
    }
}
