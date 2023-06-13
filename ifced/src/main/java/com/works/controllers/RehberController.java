package com.works.controllers;

import com.works.entities.Customer;
import com.works.repositories.CustomerRepository;
import com.works.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RehberController {


    final CustomerService customerService;

    @GetMapping("/rehber")
    public String rehber(Model model){
    model.addAttribute("donate",customerService.allCustomer());
        return "rehber";
    }
    @PostMapping("/addDonate")
    public String addDonate(Customer customer) {
        Customer c = customerService.save(customer);

        return "redirect:/rehber";
    }
}
