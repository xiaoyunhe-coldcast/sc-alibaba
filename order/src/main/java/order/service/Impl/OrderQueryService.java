package order.service.Impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Component;

/**
 * Author Administrator
 * Date 2020/10/3 0003 下午 4:23
 * Description
 */
@Component
public class OrderQueryService {

    /**
     * 订单查询接口, 使用Sentinel注解实现限流
     *
     * @param orderId
     * @return
     */
    @SentinelResource(value = "getOrderInfo", blockHandler = "handleFlowQpsException",
            fallback = "queryOrderInfo2Fallback")
    public String queryOrderInfo2(String orderId) {

        // 模拟接口运行时抛出代码异常
        if ("000".equals(orderId)) {
            throw new RuntimeException();
        }

        System.out.println("获取订单信息:" + orderId);
        return "return OrderInfo :" + orderId;
    }

    /**
     * 订单查询接口抛出限流或降级时的处理逻辑
     * <p>
     * 注意: 方法参数、返回值要与原函数保持一致
     *
     * @return
     */
    public String handleFlowQpsException(String orderId, BlockException e) {
        e.printStackTrace();
        return "handleFlowQpsException for queryOrderInfo2: " + orderId;
    }

    /**
     * 订单查询接口运行时抛出的异常提供fallback处理
     * <p>
     * 注意: 方法参数、返回值要与原函数保持一致
     *
     * @return
     */
    public String queryOrderInfo2Fallback(String orderId, Throwable e) {
        return "fallback queryOrderInfo2: " + orderId;
    }


}
