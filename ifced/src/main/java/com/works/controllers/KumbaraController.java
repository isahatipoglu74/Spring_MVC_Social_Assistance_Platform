package com.works.controllers;

import com.works.entities.PiggyBank;
import com.works.services.KumbaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class KumbaraController {

    final KumbaraService kumbaraService;
    @GetMapping("/kumbara")
    public String kumbara(Model model){

    model.addAttribute("piggyBank",kumbaraService.allPiggyBank());

        return "kumbara";
    }
   @PostMapping("/addPiggyBank")
    public String addPiggyBank(PiggyBank piggyBank){
        kumbaraService.piggyBankSave(piggyBank);
        return "redirect:/kumbara";
   }
}
