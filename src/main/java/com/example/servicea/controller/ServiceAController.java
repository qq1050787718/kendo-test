package com.example.servicea.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description BBBBoo
 * @Date 2019/12/4 15:26
 * @Author by Bbbbbo
 */
@RestController
@RequestMapping("/aApi")
public class ServiceAController {
    @PostMapping(value = "/{name}")
    public String serviceA(@PathVariable("name") String id) {
        return "<h1> SERVICE-A     " + id + "</h1>";
    }
}
