package com.male.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * UserProperties
 *
 * @author wcdzt
 * @version 1.0
 * @description
 * @date
 */
@ConfigurationProperties(prefix = "user")
public class UserProperties {
    
    private String name;

    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
