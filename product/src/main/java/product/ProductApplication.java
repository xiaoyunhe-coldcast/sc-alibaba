package product;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "common.feign.*")
@ComponentScan(basePackages = "product.*")
@MapperScan("product.mapper.*")//加上你项目的dao或service所在文件位置即可
public class ProductApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
