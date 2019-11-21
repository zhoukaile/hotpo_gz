package com.example.hotpot.Service;

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

        WxMpXmlOutMessage build = null;


        /**
         * 第一次关注公众号
         */
        if ("event".equals(type) && "subscribe".equals(wxMessage.getEvent())) {
            TextBuilder text = new TextBuilder();
            build = text.build("你 来 了", wxMessage, service);
        }

        /**
         * 文字回复
         * 1 图片
         * 2  视屏
         */

        if ("text".equals(type)) {
            TextBuilder textBuilder = new TextBuilder();

            if ("1".equals(wxMessage.getContent())) {
                ImageBuilder image = new ImageBuilder();
                build = image.build("81QyQtpuoXw4wVz4CXRNd6l3qd0CcRdDDFR249IHBHwPriZ9IgzK9k9b_cIOofzG",
                        wxMessage, service);
            } else if ("2".equals(wxMessage.getContent())) {
                VideoBuilder video = new VideoBuilder();
                build = video.build("go0vHpf65IXluKHmhp9kfp4TlA9eUX_pRCsLlg_gkgj1fIePnf8KJdrikwyLDYvl",
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
