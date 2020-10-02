package order;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("order.mapper")
@EnableAutoConfiguration
@ComponentScan({"feign","order"})
@EnableFeignClients(basePackages = "feign")
public class OrderApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}

