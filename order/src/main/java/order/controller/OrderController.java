package order.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import common.data.ResultData;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xyh
 * @since 2020-04-23
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@GetMapping("/get")
	@SentinelResource(value = "getByCode")
	public Object getOrder(@RequestParam(value = "accountCode") int accountCode) {
		ResultData<String> result = new ResultData<String>();
		return result.success(accountCode);
	}
	
}
