package com.ssp.ding.service;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;

/**
 * TODO 记得写注释
 *
 * @author: sunshaoping
 * @date: Create by in 7:05 下午 2020/6/10
 */
public interface DingClient {

    <T extends TaobaoResponse> T execute(String path, TaobaoRequest<T> request);
}
