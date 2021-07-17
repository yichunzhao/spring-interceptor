package com.ynz.demo.springinterceptor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class SpringInterceptorApplicationTests {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Test
    void contextLoads() {
        assertNotNull(applicationContext);
    }

    @Test
    void shouldMyBeansCooked() {
        List<String> cookedBeans = Arrays.asList(applicationContext.getBeanDefinitionNames());
        log.info(Integer.toString(cookedBeans.size()));

        assertThat(cookedBeans, hasItems("myWebMvcConfig", "singlePurposeInterceptor", "generalPurposeInterceptor", "countryController"));
    }

}
