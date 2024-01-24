package com.example.aws_springboot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSDemoController {

    @GetMapping("/aws")
    public String getDisplay(){
        return "Our First Deployment on AWS Ec2 is Successful";
    }
}
