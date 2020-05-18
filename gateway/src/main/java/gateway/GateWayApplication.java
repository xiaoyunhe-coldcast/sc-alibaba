package gateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Title : GateWayApplication
 * @{author} Administrator
 * @{date} 2020年5月13日
 * @{description} 
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "gateway.*")
public class GateWayApplication {
   
	public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
