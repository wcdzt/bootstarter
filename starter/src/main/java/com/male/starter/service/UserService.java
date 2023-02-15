package com.male.starter.service;

import com.male.starter.UserProperties;

/**
 * UserService
 *
 * @author wcdzt
 * @version 1.0
 * @description
 * @date
 */
public class UserService {

    private UserProperties userProperties;

    public String getUser() {
        return userProperties.getName() + "," + userProperties.getPhone();
    }

    public void setUserProperties(UserProperties userProperties) {
        this.userProperties = userProperties;
    }
}
