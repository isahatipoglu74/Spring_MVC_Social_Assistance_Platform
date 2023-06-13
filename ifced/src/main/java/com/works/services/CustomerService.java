package com.works.services;

import com.works.entities.Customer;
import com.works.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    final CustomerRepository customerRepository;

    //Customer listeleme metodu
    public List<Customer> allCustomer(){

       return customerRepository.findAll();

    }
    public Customer save(Customer customer){

       return customerRepository.save(customer);
    }



    //Customer silme metodu
    public boolean customerDelete(String stcid) {
        try {
            long cid=Long.parseLong(stcid);
            boolean status=customerRepository.existsById(cid);
            if(status){
                customerRepository.deleteById(cid);
                return true;
            }else {
                return false;
            }
        }catch (Exception exception){
            System.err.println("Delete Error"+exception);
            return false;
        }
    }
    public boolean customerUpdate(Customer customer){
        try {
            customerRepository.saveAndFlush(customer);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
    //Cusomter kontrolü yapma ( cid ) varmı yokmu?
    public Customer getSingleCustomer( Long cid ) {
        Optional<Customer> optionalCustomer = customerRepository.findById(cid);
        if ( optionalCustomer.isPresent() ){
            return optionalCustomer.get();
        }
        return null;
    }

    public Customer loginGonullu(String email,String password){
        try {
    Optional<Customer> optionalCustomer=customerRepository.findByEmailEqualsIgnoreCaseAndPasswordEquals(email,password);
        if(optionalCustomer.isPresent()){
            return optionalCustomer.get();
        }

    }catch (Exception ex){
        System.err.println("Login fail"+ex);
    }
        return null;

}


}
