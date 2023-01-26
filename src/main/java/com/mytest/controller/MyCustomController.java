package com.mytest.controller;

import com.mytest.service.MyCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/my")
public class MyCustomController {

    private MyCustomService myCustomService;

    @Autowired
    public MyCustomController(MyCustomService service) {
        this.myCustomService = service;
    }

    @GetMapping("/firstRequest")
    public String firstRequest() {
        return myCustomService.firstRequestByCriteria();
    }

}
