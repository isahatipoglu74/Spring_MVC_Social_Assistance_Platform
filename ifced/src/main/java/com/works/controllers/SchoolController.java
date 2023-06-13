package com.works.controllers;

import com.works.entities.Customer;
import com.works.services.CustomerService;
import com.works.services.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class SchoolController {

    final ManagerService manager;
    final CustomerService customerService;
    private Long updateID = 0l;

    @GetMapping("/school")
    public String school(Model model) {
        model.addAttribute("customer", customerService.allCustomer());
        updateID = 0l;
        return "school";
    }

    @GetMapping("/customerDelete/{stcid}")
    public String customerDelete(@PathVariable String stcid) {
        boolean status = customerService.customerDelete(stcid);
        System.out.println("Status : " + status);
        return "redirect:/school";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(Customer customer) {
        Customer c = customerService.save(customer);

        return "redirect:/school";
    }


    @GetMapping("/school/{cid}")
    public String schoolUpdate(Model model, @PathVariable Long cid) {
        updateID = cid;
        model.addAttribute("customers", customerService.allCustomer());
        model.addAttribute("customer", customerService.getSingleCustomer(cid));
        return "schoolUpdate";
    }
    @PostMapping("/customerUpdate")
    public String customerUpdate( Customer customer ) {
        customer.setCid(updateID);
        customerService.customerUpdate(customer);
        return "redirect:/school";
    }
}
