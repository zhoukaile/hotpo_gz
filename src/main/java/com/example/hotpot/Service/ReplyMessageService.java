package com.example.hotpot.Service;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

public interface ReplyMessageService {
    WxMpXmlOutMessage replyMessageByText(String type, WxMpXmlMessage wxMessage, WxMpService service);
}
