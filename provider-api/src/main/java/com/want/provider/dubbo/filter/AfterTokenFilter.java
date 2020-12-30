package com.want.provider.dubbo.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

import static org.apache.dubbo.rpc.Constants.TOKEN_KEY;

/**
 * @author WangZhiJian
 * @since 2020/12/30
 */
@Slf4j
@Activate(group = CommonConstants.PROVIDER, order = -1)
public class AfterTokenFilter implements Filter {

    /**
     * Make sure call invoker.invoke() in your implementation.
     *
     * @param invoker
     * @param invocation
     */
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        log.info("tokens is {}--{}"
                ,invoker.getUrl().getParameter(TOKEN_KEY)
                ,invocation.getAttachment(TOKEN_KEY));

        return invoker.invoke(invocation);
    }


}
