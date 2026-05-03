package com.learning.projects.airBnbApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // Allow your React dev server (Vite default port)
                .allowedOrigins(
                    "http://localhost:5173",
                    "http://localhost:3000"
                )
                .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                // IMPORTANT: allowCredentials=true is needed for the
                // refreshToken httpOnly cookie to be sent/received
                .allowCredentials(true)
                .maxAge(3600);
    }
}
