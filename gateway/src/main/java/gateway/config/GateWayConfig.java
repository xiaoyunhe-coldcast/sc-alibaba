package gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zgd
 * @Date: 2019/1/8 19:09
 * @Description:
 */
@Configuration
public class GateWayConfig {
	
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        
        return builder.routes()
                .route(r -> r.path("/product/**")
                        .filters(f -> f.filter(new RequestTimeFilter())
                                .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                        .uri("http://localhost:8010/account/test")
                        .order(0)
                        .id("account")
                )
                .build();
    }



	 

}
