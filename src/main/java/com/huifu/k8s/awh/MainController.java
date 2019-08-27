package com.huifu.k8s.awh;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jianfei.chen on 2017/2/20.
 */
@RestController
public class MainController {

    @RequestMapping("/validate")
    public JSONObject index(@RequestBody String obj) {
        System.out.println("received: " + obj);

        JSONObject json = new JSONObject();
        try {
            JSONObject request = JSON.parseObject(obj);
            String     uid     = request.getJSONObject("request").getString("uid");

            json.put("apiVersion", "admission.k8s.io/v1beta1");
            json.put("kind", "AdmissionReview");
            JSONObject response = new JSONObject();
            json.put("response", response);
            response.put("uid", uid);
            response.put("allowed", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    @RequestMapping("/monitor")
    public String monitor() {
        System.out.println("OK");
        return "OK";
    }

}
