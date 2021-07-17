package com.ynz.demo.springinterceptor;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class MyWebMvcConfig implements WebMvcConfigurer {
    private final GeneralPurposeInterceptor generalInterceptor;
    private final SinglePurposeInterceptor singlePurposeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(generalInterceptor);
        registry.addInterceptor(singlePurposeInterceptor).addPathPatterns("/jet-fighters");
    }

}
