package com.smart.spring.boot;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author liujunhua
 * @description: TODO
 * @date 2021/1/1417:25
 */
public class PrintAfterInitBean  implements InitializingBean {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(message);
    }
}
