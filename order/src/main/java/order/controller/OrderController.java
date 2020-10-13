package order.controller;


import com.alibaba.csp.sentinel.slots.block.BlockException;
import feign.AccountFeign;
import order.service.Impl.OrderQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import common.data.ResultData;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xyh
 * @since 2020-04-23
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Inject
    AccountFeign accountFeign;

    @Autowired
    OrderQueryService orderQueryService;

    @GetMapping("/get")
    @SentinelResource(value = "getByCode")
    public Object getOrder(@RequestParam(value = "accountCode") int accountCode) {
        ResultData<String> result = new ResultData<String>();
        return ResultData.success(accountCode);
    }

    @GetMapping("/feign")
    public Object testFeign() {
        return accountFeign.get();
    }


    /**
     * 限流实现方式二: 注解定义资源
     *
     * @param orderId
     * @return
     */
    @RequestMapping("/getOrder2")
    @ResponseBody
    public String queryOrder3(@RequestParam("orderId") String orderId) {
        return orderQueryService.queryOrderInfo2(orderId);
    }

}
