package feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/feign")
@RestController
public class testController {
	
	/**
	 *@{author} jifeng
	 *@{date} 2020年4月24日
	 *@{tags} @return
	 */
	@GetMapping("/test")
	public Object getObject() {
		return "hhh";
	}

}
