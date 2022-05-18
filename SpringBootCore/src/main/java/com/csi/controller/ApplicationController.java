package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "Welcome To HMINFOTECH";
    }
    @GetMapping("/service")
    public String sayService(){
        return "SOFTWARE SERVICE COMPANY";
    }
    @GetMapping("/address")
    public String sayaddress(){
        return "SILICON VALLEY | USA";
    }
    @GetMapping("/sanket")
    public String sanket(){
        return "this is created by Sanket";
    }



}
