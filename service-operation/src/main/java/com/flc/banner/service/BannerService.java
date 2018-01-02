package com.flc.banner.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BannerService {

    public JSONObject getlist() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "operation.banner.getlist");
        return jsonObject;
    }

}
