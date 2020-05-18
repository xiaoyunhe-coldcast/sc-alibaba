package gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.util.logUtil;

@RestController
@RequestMapping("/product")
public class testController {
	
	@GetMapping("/test")
	public Object test() {
		logUtil.info("gateway的测试服务");
		System.out.println("gateway的测试服务");
		return "gateway";
	}
}
