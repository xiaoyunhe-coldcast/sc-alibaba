package account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("account.mapper")
@ComponentScan("account")
public class AccountApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}

