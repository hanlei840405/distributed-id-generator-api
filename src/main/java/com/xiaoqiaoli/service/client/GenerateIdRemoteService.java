package com.xiaoqiaoli.service.client;

/**
 * Created by hanlei6 on 2016/7/20.
 */
public interface GenerateIdRemoteService {
    /**
     * 获取分布式自增ID
     * @param application
     * @param module
     * @return
     */
    String get(String application, String module);
}
