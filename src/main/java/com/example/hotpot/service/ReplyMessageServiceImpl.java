package com.example.hotpot.service;

import com.example.hotpot.build.ImageBuilder;
import com.example.hotpot.build.TextBuilder;
import com.example.hotpot.build.VideoBuilder;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReplyMessageServiceImpl implements ReplyMessageService{

    @Override
    public WxMpXmlOutMessage replyMessageByText(String type, WxMpXmlMessage wxMessage, WxMpService service) {
        /**
         * 文字回复
         * 1 图片
         * 2  视屏
         */
        WxMpXmlOutMessage build = null;
        if ("text".equals(type)) {
            TextBuilder textBuilder = new TextBuilder();

            if ("1".equals(wxMessage.getContent())) {
                ImageBuilder image = new ImageBuilder();
                build = image.build("S4MJxaurMcbu7veVUibTybEFfQl2ix_K6NYq69ozuRWr9NT0laUfzI_QcZ96mrPk",
                        wxMessage, service);
            } else if ("2".equals(wxMessage.getContent())) {
                VideoBuilder video = new VideoBuilder();
                build = video.build("5lpRqnjSKIntZMqDFdOIhiqnGSbY0P_5_X4-u9NKtYUd0PD4-FZH-Jc3DpGzCDKE",
                        wxMessage, service);
            } else {
                TextBuilder text = new TextBuilder();
                build = text.build("图片: 请回复【1】\n视屏: 请回复【2】", wxMessage, service);
            }
            return build;
        }

        return build;
    }
}
