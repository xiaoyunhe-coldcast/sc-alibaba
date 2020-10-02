package feign.controller;

import feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RequestMapping("/feign")
@RestController
public class testController {

    @RequestMapping("/test")
    public Object testFeign(){
       return "iii";
    }

}
