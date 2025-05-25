package com.vladimirv.springbootauth.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApi {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Spring Boot Auth API")
                .version("1.0.0")
                .description("API documentation for the Spring Boot Auth project")
                .contact(new Contact()
                    .name("Vladimir Vaca")
                    .email("your.email@example.com")
                )
            );
    }
}
