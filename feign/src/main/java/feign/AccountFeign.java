package feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "account")
public interface AccountFeign {
	
    @PostMapping("/user/user")
    Object get();

    
}
