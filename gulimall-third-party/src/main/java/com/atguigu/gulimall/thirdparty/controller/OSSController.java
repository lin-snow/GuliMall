package com.atguigu.gulimall.thirdparty.controller;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.thirdparty.service.OSSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("thirdparty")
public class OSSController {

    @Autowired
    OSSService ossService;

    @RequestMapping("/oss/policy")
    public R policy() {
        return R.ok().put("data", ossService.getUploadPolicy());
    }

}