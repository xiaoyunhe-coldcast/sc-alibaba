package account.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.data.ResultData;

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
@RequestMapping("/user")
public class UserController {
	
	/**
	 *@{author} jifeng
	 *@{date} 2020年4月24日
	 *@{tags} @return
	 */
	@GetMapping("/user")
	public Object getUser() {
		ResultData<String> result = new ResultData<String>();
		return ResultData.success("account-user");
	}

}

