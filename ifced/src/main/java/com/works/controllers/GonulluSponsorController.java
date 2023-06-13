package com.works.controllers;

import com.works.entities.Kid;
import com.works.services.KidService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class GonulluSponsorController {

    final KidService kidService;

    @GetMapping("/gonulluSponsor")
    public String gonulluSponsor(Model model){

        model.addAttribute("kidList",kidService.allKids());
        return "gonulluSponsor";
    }
    @PostMapping ("/addKids")
    public String addKids(Kid kid){

        kidService.kidSave(kid);
        return "redirect:/gonulluSponsor";
    }

}
