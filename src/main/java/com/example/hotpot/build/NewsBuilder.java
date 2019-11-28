package com.example.hotpot.build;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage.Item;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutVideoMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
public class NewsBuilder extends AbstractBuilder {

    @Override
    public WxMpXmlOutMessage build(String content, WxMpXmlMessage wxMessage,
                                   WxMpService service) {

        List<Item> list = new ArrayList();

        Item item = new Item();
        item.setTitle("光山楠朝鲜门店开业啦");
        item.setDescription("吃最嫩的牛腩,做最潮流的事情");
        item.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/LtaLLZf9OUhEAoibormtvia2QfU0PKdJIa1YCxRfyJT6GoD8LjGicXLLvuqUUIszLAElE8V5nTrUXJL9b5Tx26RzQ/0");
        item.setUrl("http://www.hotpotgz.com/page/main.html");
/*
        Item item1 = new Item();
        item1.setTitle("楠朝鲜地址");
        item1.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/MdBADM1L8Zc8AdmicW7xdJIMH6WHlEmCKeBXr3bicVPNn00DohdhRQkFWvV7fqkMJkDLr4gqN2tP7lM8yoJ4m5oA/0");
        item1.setUrl("http://www.baidu.com");

        Item item2 = new Item();
        item2.setTitle("哈哈哈哈");
        item2.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/MdBADM1L8Zc8AdmicW7xdJIMH6WHlEmCKeBXr3bicVPNn00DohdhRQkFWvV7fqkMJkDLr4gqN2tP7lM8yoJ4m5oA/0");
        item2.setUrl("http://www.baidu.com");

        Item item3 = new Item();
        item3.setTitle("呵呵呵和");
        item3.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/MdBADM1L8Zc8AdmicW7xdJIMH6WHlEmCKeBXr3bicVPNn00DohdhRQkFWvV7fqkMJkDLr4gqN2tP7lM8yoJ4m5oA/0");
        item3.setUrl("http://www.baidu.com");

        Item item4 = new Item();
        item4.setTitle("阿拉啦啦啦");
        item4.setPicUrl("http://mmbiz.qpic.cn/mmbiz_jpg/MdBADM1L8Zc8AdmicW7xdJIMH6WHlEmCKeBXr3bicVPNn00DohdhRQkFWvV7fqkMJkDLr4gqN2tP7lM8yoJ4m5oA/0");
        item4.setUrl("http://www.baidu.com");*/

        list.add(item);
        /*list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);*/
        WxMpXmlOutNewsMessage m = WxMpXmlOutMessage.NEWS().articles(list)
            .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
            .build();

        return m;
    }

}
