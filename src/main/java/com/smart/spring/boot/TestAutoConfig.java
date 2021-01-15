package com.smart.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liujunhua
 * @description: TODO
 * @date 2021/1/1417:26
 */
@Configuration
public class TestAutoConfig {
    @Bean
    @ConfigurationProperties(prefix = "init")
    @ConditionalOnMissingBean(PrintAfterInitBean.class)
    @ConditionalOnProperty(prefix = "init",value = "message")
    public PrintAfterInitBean printAfterInitBean() {
        return new PrintAfterInitBean();
    }
}
