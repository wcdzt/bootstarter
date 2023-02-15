package com.male.web.controller;

import com.male.starter.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author wcdzt
 * @version 1.0
 * @description
 * @date
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/getUser")
    public String getUser() {
        return userService.getUser();
    }

}
