package com.github.vspro.cloudgatewayitd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudGatewayItdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayItdApplication.class, args);
    }


    @Bean
    public RouteLocator customerRouter(RouteLocatorBuilder builder) {

        return builder.routes()
                .route("sgq", r -> r.path("/questions")
                        .uri("https://segmentfault.com/")).build();

    }
}
