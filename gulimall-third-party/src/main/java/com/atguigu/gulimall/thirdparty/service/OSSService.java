package com.atguigu.gulimall.thirdparty.service;

import java.util.Map;

public interface OSSService {

    /**
     * 返回服务端的签名信息
     * @return
     */
    Map<String, String> getUploadPolicy();
}
