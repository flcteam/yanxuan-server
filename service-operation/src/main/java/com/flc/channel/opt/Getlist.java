package com.flc.channel.opt;

import com.alibaba.fastjson.JSONObject;
import com.flc.channel.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("operation.channel.getlist")
public class Getlist {

    @Autowired
    private ChannelService channelService;

    @RequestMapping(value = "/operation/channel/getlist")
    public JSONObject exe() {
        return channelService.getlist();
    }

}
