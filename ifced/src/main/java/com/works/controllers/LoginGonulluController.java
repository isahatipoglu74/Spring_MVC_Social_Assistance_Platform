package com.works.controllers;

import com.works.entities.Customer;
import com.works.entities.Manager;
import com.works.services.CustomerService;
import com.works.services.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginGonulluController {

    final ManagerService managerService;
    final CustomerService customerService;

    @GetMapping("/loginGonullu")
    public String loginGonullu(){
        return "loginGonullu";
    }
    @PostMapping("/loginGonullu")
    public String loginUserGonullu(Customer customer){
        Customer c = customerService.loginGonullu(customer.getEmail(),customer.getPassword());
        if (c == null) {
            return "redirect:/loginGonullu";

        }
        return "redirect:/gonulluHome";
    }


}
