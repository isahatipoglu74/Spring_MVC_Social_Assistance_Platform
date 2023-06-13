package com.works.controllers;

import com.works.entities.Customer;
import com.works.entities.Manager;
import com.works.repositories.ManagerRepository;
import com.works.services.CustomerService;
import com.works.services.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    final ManagerService managerService;
    final CustomerService customerService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/userLogin")
    public String loginUser(Manager manager){
        Manager m = managerService.login(manager.getEmail(),manager.getPassword());
        if (m == null) {
                return "redirect:/login";

        }
        return "redirect:/home";
    }

}
