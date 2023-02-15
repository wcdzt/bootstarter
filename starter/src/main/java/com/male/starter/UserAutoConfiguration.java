package com.male.starter;

import com.male.starter.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * UserAutoConfiguration
 *
 * @author wcdzt
 * @version 1.0
 * @description
 * @date
 */
@Configuration
@EnableConfigurationProperties(UserProperties.class)
//当SpringIoc容器内存在指定Class的条件
@ConditionalOnClass(UserService.class)
@RequiredArgsConstructor
public class UserAutoConfiguration {

    private final UserProperties userProperties;

    @Bean
    @ConditionalOnMissingBean(UserService.class)
    public UserService getUserService() {
        var userService = new UserService();
        userService.setUserProperties(userProperties);
        return userService;
    }

}
