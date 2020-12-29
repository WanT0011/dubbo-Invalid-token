package com.want.provider.dubbo.api;


import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author WangZhiJian
 * @since 2020/12/24
 */
@DubboService(version = "1.0.0",mock = "com.want.provider.dubbo.api.fallback.EchoServiceFallBack")
public class EchoServiceImpl implements EchoService {

    @Value("${server.port}")
    private Integer port;

    @Override
    public String echo(String str) {
        return port + ":" + str;
    }
}
