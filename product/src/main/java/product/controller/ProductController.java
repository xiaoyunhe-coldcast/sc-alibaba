package product.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.util.logUtil;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xyh
 * @since 2020-04-23
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/test")
	public Object test() {
		logUtil.info("product的测试服务");
		System.out.println("product的测试服务");
		return "product";
	}

}
