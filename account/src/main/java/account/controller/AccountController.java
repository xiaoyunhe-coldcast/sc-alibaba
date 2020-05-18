package account.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.util.logUtil;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xyh
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/account")
public class AccountController {
	
	@GetMapping("/test")
	public Object test() {
		System.out.println("account的测试服务");
		logUtil.info("account的测试服务");
		return "account";
	}
}

