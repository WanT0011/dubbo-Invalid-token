package com.want.consumer;

import com.want.consumer.controller.EchoController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.time.LocalTime;

/**
 * @author WangZhiJian
 * @since 2020/12/24
 */
@Slf4j
@EnableScheduling
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Resource
    private EchoController echoController;

    @Scheduled(fixedDelay = 1 * 1000L)
    public void scheduled(){
        log.info(echoController.echo(LocalTime.now().toString()));
    }
}
