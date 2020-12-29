package com.want.provider.dubbo.api.fallback;

import com.want.provider.dubbo.api.EchoService;

/**
 * @author WangZhiJian
 * @since 2020/12/24
 */
public class EchoServiceFallBack implements EchoService {
    @Override
    public String echo(String str) {
        return "fall back!";
    }
}
