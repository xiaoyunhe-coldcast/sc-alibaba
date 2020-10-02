package product.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.util.logUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

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
@Api("Product-Api")
public class ProductController {
	
	@GetMapping("/test")
	@ApiOperation(value = "product-test",notes = "test-product")
	public Object test() {
		logUtil.info("product的测试服务");
		System.out.println("product的测试服务");
		return "product";
	}

}
