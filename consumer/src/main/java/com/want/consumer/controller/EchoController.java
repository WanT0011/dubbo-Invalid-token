package com.want.consumer.controller;

import com.want.provider.dubbo.api.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangZhiJian
 * @since 2020/12/24
 */
@RestController
public class EchoController {

    @DubboReference(version = "1.0.0", mock = "com.want.provider.dubbo.api.fallback.EchoServiceFallBack")
    private EchoService echoService;

    @GetMapping("echo")
    public String echo(String str){
        return echoService.echo(str);
    }

}
