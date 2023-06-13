package com.works.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ProjectController {

    @GetMapping("/project")
    public String project(){

        return "project";
    }
}
