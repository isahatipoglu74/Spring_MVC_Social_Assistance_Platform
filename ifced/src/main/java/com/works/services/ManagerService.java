package com.works.services;

import com.works.entities.Manager;
import com.works.repositories.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ManagerService {

    final ManagerRepository managerRepository;

    public Manager login(String email,String password){
        try {
            Optional<Manager> optionalManager=managerRepository.findByEmailEqualsIgnoreCaseAndPasswordEquals(email, password);
            if(optionalManager.isPresent()){
                return optionalManager.get();
            }

        }catch (Exception ex){
            System.err.println("Login fail"+ex);
        }
        return null;

    }

}
