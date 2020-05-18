package order;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("order.mapper")
public class OrderApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}

