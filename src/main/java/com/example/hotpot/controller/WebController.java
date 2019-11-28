package com.example.hotpot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.util.StringUtil;

import java.io.IOException;

//注入类的私有属性
@AllArgsConstructor
@Controller
@RequestMapping("/hotpot")
@Slf4j
public class WebController {

    // 其实是WxMpConfiguration类下的wxMpService对象, 它是获取appid和私钥的配置
    private final WxMpService wxService;

    private static String URL = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=%s";

    private static String MediaId = "https://api.weixin.qq.com/cgi-bin/material/add_material?access_token=%s&type=%s";


    @GetMapping("/index")
    public String toIndex(){
        return "index";
    }


    @GetMapping("/material.html")
    public String Material(){
        return "material.html";
    }

    @GetMapping("/main.html")
    public String Main(){
        return "main.html";
    }

    @PostMapping("/add/image/toUrl")
    @ResponseBody
    public String uploadImageToUrl(@RequestParam("file") MultipartFile file ) throws  Exception{
        Assert.notNull(file, "参数不可以为空");
        String url = "";
        //获取Token
        String accessToken = wxService.getAccessToken();
        String url2Token = String.format(URL, accessToken);
        //获取文件的文件名字(后面要用到)
        String  filename  =  file.getOriginalFilename();
        //这个url是要上传到另一个服务器上接口
        CloseableHttpClient aDefault  =  HttpClients.createDefault();
        try  {
            HttpPost httpPost  =  new  HttpPost(url2Token);
            MultipartEntityBuilder builder  =  MultipartEntityBuilder.create();
            //使用这个，另一个服务就可以接收到这个file文件了
            builder.addBinaryBody("file",file.getBytes(), ContentType.create("multipart/form-data"),filename);
            HttpEntity entity  =  builder.build();
            httpPost.setEntity(entity);
            ResponseHandler<Object>  rh  =  new  ResponseHandler<Object>()  {
                @Override
                public  Object  handleResponse(HttpResponse response)  throws IOException {
                    HttpEntity  entity  =  response.getEntity();
                    String  result  =  EntityUtils.toString(entity,  "UTF-8");
                    return  result;
                }
            };
            String str = (String)aDefault.execute(httpPost, rh);
            JSONObject jsonObject = JSON.parseObject(str);
            url = (String)jsonObject.get("url");

        }  catch  (Exception  e)  {
            log.error(String.format(e.toString()));
        }  finally  {
            aDefault.close();
        }
        if (StringUtil.isNotEmpty(url)) {
            return url;
        }
        return "返回图片url为空";
    }



    @PostMapping("/add/image/toMediaId")
    @ResponseBody
    public String uploadMaterialToMediaId(@RequestParam("file") MultipartFile file ) throws  Exception{
        Assert.notNull(file, "参数不可以为空");
        String url = "";
        //获取Token
        String accessToken = wxService.getAccessToken();
        String url2Token = String.format(URL, accessToken);
        //获取文件的文件名字(后面要用到)
        String  filename  =  file.getOriginalFilename();
        //这个url是要上传到另一个服务器上接口
        CloseableHttpClient aDefault  =  HttpClients.createDefault();
        try  {
            HttpPost httpPost  =  new  HttpPost(url2Token);
            MultipartEntityBuilder builder  =  MultipartEntityBuilder.create();
            //使用这个，另一个服务就可以接收到这个file文件了
            builder.addBinaryBody("file",file.getBytes(), ContentType.create("multipart/form-data"),filename);
            HttpEntity entity  =  builder.build();
            httpPost.setEntity(entity);
            ResponseHandler<Object>  rh  =  new  ResponseHandler<Object>()  {
                @Override
                public  Object  handleResponse(HttpResponse response)  throws IOException {
                    HttpEntity  entity  =  response.getEntity();
                    String  result  =  EntityUtils.toString(entity,  "UTF-8");
                    return  result;
                }
            };
            String str = (String)aDefault.execute(httpPost, rh);
            JSONObject jsonObject = JSON.parseObject(str);
            url = (String)jsonObject.get("url");

        }  catch  (Exception  e)  {
            log.error(String.format(e.toString()));
        }  finally  {
            aDefault.close();
        }
        if (StringUtil.isNotEmpty(url)) {
            return url;
        }
        return "返回图片url为空";
    }
}
