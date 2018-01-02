package com.flc.channel.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class ChannelService {

    public JSONObject getlist() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "operation.channel.getlist");
        return jsonObject;
    }

}
