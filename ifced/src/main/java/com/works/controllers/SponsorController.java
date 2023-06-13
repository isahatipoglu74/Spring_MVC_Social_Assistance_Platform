package com.works.controllers;

import com.works.entities.Kid;
import com.works.entities.PiggyBank;
import com.works.services.KidService;
import com.works.services.KumbaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SponsorController {

    final KidService kidService;

    @GetMapping("/sponsor")
    public String sponsor(Model model){

        model.addAttribute("kidList",kidService.allKids());
        return "sponsor";
    }
    @PostMapping ("/addKid")
    public String addKid(Kid kid){

        kidService.kidSave(kid);
        return "redirect:/sponsor";
    }

}
