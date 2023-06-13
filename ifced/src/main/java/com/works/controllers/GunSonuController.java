package com.works.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GunSonuController {

    @GetMapping("/gunsonu")
    public String gunsonu(){

        return "gunsonu";
    }
}
