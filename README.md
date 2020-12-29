    结构说明：
        1：provider-api          接口传输实体的定义
        2：provider-1800x        内部实现一致，实现api的接口
        3：consumer              消费者，定时调用provider
    环境说明：
        外部环境仅依赖nacos
    复现说明：
        本地快速启动nacos即可
        启动两个服务者
        启动消费者，会出现调用其中一个出现Invalid token!的异常，如果调用正常请重新启动消费者多试几次。
        出现的概率还是比较大的
        
    bug原因：
        初步认为调用到了服务端，url的token发生了变化，导致token校验失败