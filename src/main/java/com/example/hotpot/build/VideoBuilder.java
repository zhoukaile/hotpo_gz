package com.example.hotpot.build;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutVideoMessage;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
public class VideoBuilder extends AbstractBuilder {

    @Override
    public WxMpXmlOutMessage build(String content, WxMpXmlMessage wxMessage,
                                   WxMpService service) {

        WxMpXmlOutVideoMessage m = WxMpXmlOutMessage.VIDEO().mediaId(content).title("楠潮鲜火锅视频").description("吃火锅就到楠潮鲜")
            .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
            .build();

        return m;
    }

}
