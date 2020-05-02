package com.example.appointment.modular;

import com.alibaba.fastjson.JSONObject;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
public class CodeController {
    //短信平台相关参数
    //这个不用改
    private String apiUrl = "https://sms_developer.zhenzikj.com";
    //榛子云系统上获取
    private String appId = "105553";
    private String appSecret = "a5b3c524-b408-49b6-9f1d-3c8ab6aded19";

    @ResponseBody
    @GetMapping("/fitness/code")
    public String getCode(@RequestParam("telephone") String telephone, HttpSession httpSession){
        try {
            JSONObject json = null;
            //随机生成验证码
            String code = String.valueOf(new Random().nextInt(999999));
            //将验证码通过榛子云接口发送至手机
            ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
            String result = client.send(telephone, "您的验证码为:" + code + "，该码有效期为5分钟，该码只能使用一次!");
//            String result = client.send(telephone, "刘静女士，你好！恭喜你获得本次大奖！！！价值500万！！请拨打13352240878，并说出你的暗号:"+code);
            json = JSONObject.parseObject(result);
            if (json.getIntValue("code")!=0){//发送短信失败
                return  "发送短信失败";
            }
            //将验证码存到session中,同时存入创建时间
            //以json存放，这里使用的是阿里的fastjson
            json = new JSONObject();
            json.put("telephone",telephone);
            json.put("code",code);
            json.put("createTime",System.currentTimeMillis());
            // 将认证码存入SESSION
            httpSession.setAttribute("code",json);
            return code;
        } catch (Exception e) {
            e.printStackTrace();
            return "发送短信失败";
        }
    }
}