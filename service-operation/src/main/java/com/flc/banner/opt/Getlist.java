package com.flc.banner.opt;

import com.alibaba.fastjson.JSONObject;
import com.flc.banner.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("operation.banner.getlist")
public class Getlist {

    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/operation/banner/getlist")
    public JSONObject exe() {
        return bannerService.getlist();
    }

}
