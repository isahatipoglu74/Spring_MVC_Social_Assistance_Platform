package com.works.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeControllerGonullu {

    @GetMapping("/gonulluHome")
    public String gonulluHome(){

        return "gonulluHome";
    }
}
