package com.works.controllers;

import com.works.services.KumbaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class GonulluKumbaraController {

    final KumbaraService kumbaraService;
    @GetMapping ("/gonulluKumbara")
    public String gonulluKumbara(Model model){
        model.addAttribute("piggyBank",kumbaraService.allPiggyBank());
        return "gonulluKumbara";

    }
}
