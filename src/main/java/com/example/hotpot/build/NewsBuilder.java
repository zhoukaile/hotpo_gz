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
        item.setTitle("开业大吉");
        item.setDescription("今天我们开业了");
        item.setPicUrl("http://www.baidu.com/baidu.php?url=0f00000uEDLSpLgiCoVkyLmL51o14N_7AlbHfcf0VXa_CHbp4lBD3_1OKr0sPxgaFToHdLEWlMzJ70Vb2dzymdJtdhFuB_i19oKu0M-TFEfWpJ5Ad90q64qXVySBPjrSThUzooCELjQ0UYnmeu5GGGxsxkWoA_ri4YZPKcig9_XR1bmSP6qeJpthAMte32f3NfivQ3RIt6C73x_M6MG_8sdje65M.DR_inLm2QnNL-TqhQAOnBjA1JHKwuB8xhk_lbsRDkfGBCIe_x3drkOX4WFbePdMuEolkYgR5ETkkzNvurV7MK7jNqehnheFgELqPMyeZtnzypjOCHqehPSeIb3tISHoIWS7qjwqehr5yrBl9S61JSq1ZWklYAuVipZL8moo3ePOH3qMNhOqKMRs1d9uCyxX4WFud9uCNOX4WWvNqhOoa1fzxX4WFYvUPLgVHC3ZHgxX4BE_oLurM_tTh1kLIUvTyKB9P6iGxGudF_3ojPakYde8MTC0.U1Yk0ZDqEloiVfKspynqnfKY5USJYoR0pyYqn1mL0ATqTZP8TsKdpHY0TA-b5Hnz0APGujYzrj00Ugfqn103rNtznj640AVG5HD0TMfqnHDY0ANGujY0mhbqn7tznjwxn10zg1nsnsKVm1Ysg100TgKGujYs0Z7Wpyfqn0KzuLw9u1Ys0AdGujYs0A-kIjYs0A7B5HKxn0K-ThTqn0KsTjYs0A4vTjYsQW0snj0snj0s0AdYTjYs0AwbUL0qn0KzpWYs0AuY5H00TA6qn0KET1Ys0AFL5H00UMfqn0K1XWY0mgPxpywW5y41QyPY0A-bm1Y0IZN15HD1nWc3n1RdP1nkPHcvP1c4n1610ZF-TgfqnHRLPj03rHDsPWfsPfK1pyfqrHndrAn4ujD3mWNbnjfsufKWTvYqnYR4P1mdwDcvnbRdrH6YwfK9m1Yk0ZK85H00TydY5H00Tyd15H00XMfqn0KVmdqhThqV5HKxn0Kbmy4dmhNxTAk9Uh-bT1Ysg100TA7Ygvu_myTqn0Kbmv-b5H00ugwGujYVnfK9TLKWm1Ys0ZNspy4Wm1Ys0Z7VuWYs0AuWIgfqn0KGTvP_5H00XMK_Ignqn0K9uAu_myTqnfK_uhnqn0KbmvPb5fKBIjYs0AqY5H00ULFsIjYsc10Wc10Wnansc108nj0snj0sc10Wc100TNqv5HRsQW0sg108njKxna3sn7tsQW0kg108nj7xna3sn0KWThnqPHD1rjn&word=%E5%BC%80%E4%B8%9A");
        item.setUrl("www.baidu.com");

        Item item1 = new Item();
        item1.setTitle("开");
        item1.setDescription("开业");
        item1.setPicUrl("https://image.baidu.com/search/detail?ct=503316480&z=&tn=baiduimagedetail&ipn=d&word=%E5%BC%80%E4%B8%9A%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=-1&hd=&latest=&copyright=&cs=2477094540,4103149082&os=802811454,272527928&simid=4075685301,684779764&pn=2&rn=1&di=10010&ln=1045&fr=&fmq=1574089165766_R&ic=&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&is=0,0&istype=2&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&hs=2&objurl=http%3A%2F%2Fpic31.nipic.com%2F20130702%2F10918230_180435085389_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        item1.setUrl("http://www.baidu.com");

        Item item2 = new Item();
        item2.setTitle("业");
        item2.setDescription("欢迎");
        item2.setPicUrl("https://image.baidu.com/search/detail?ct=503316480&z=&tn=baiduimagedetail&ipn=d&word=%E5%BC%80%E4%B8%9A%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=-1&hd=&latest=&copyright=&cs=2132914477,1691322042&os=3131921841,1005069561&simid=4067776070,487895873&pn=82&rn=1&di=21340&ln=1045&fr=&fmq=1574089165766_R&ic=&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&is=0,0&istype=2&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&hs=2&objurl=http%3A%2F%2Fimg011.hc360.cn%2Fm7%2FM00%2F46%2FAB%2FwKhQpFbWXfCEEgVqAAAAAFSLOGY661.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        item2.setUrl("http://www.baidu.com");

        Item item3 = new Item();
        item3.setTitle("大");
        item3.setDescription("大家");
        item3.setPicUrl("https://image.baidu.com/search/detail?ct=503316480&z=&tn=baiduimagedetail&ipn=d&word=%E5%BC%80%E4%B8%9A%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=-1&hd=&latest=&copyright=&cs=1048467209,3327629141&os=96166162,95309783&simid=4251035992,596938751&pn=244&rn=1&di=114290&ln=1045&fr=&fmq=1574089165766_R&ic=&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&is=0,0&istype=2&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&hs=2&objurl=http%3A%2F%2Fpic16.nipic.com%2F20110823%2F7773237_112455425000_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        item3.setUrl("http://www.baidu.com");

        Item item4 = new Item();
        item4.setTitle("吉");
        item4.setDescription("来");
        item4.setPicUrl("https://image.baidu.com/search/detail?ct=503316480&z=&tn=baiduimagedetail&ipn=d&word=%E5%BC%80%E4%B8%9A%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=-1&hd=&latest=&copyright=&cs=4262719015,125507478&os=3684567882,163613934&simid=4011631593,451462107&pn=284&rn=1&di=10780&ln=1045&fr=&fmq=1574089165766_R&ic=&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&is=0,0&istype=2&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&hs=2&objurl=http%3A%2F%2Fpic8.nipic.com%2F20100702%2F527847_230945047914_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        item4.setUrl("http://www.baidu.com");

        list.add(item);
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        WxMpXmlOutNewsMessage m = WxMpXmlOutMessage.NEWS().articles(list)
            .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
            .build();

        return m;
    }

}
