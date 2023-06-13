package com.works.services;

import com.works.entities.Customer;
import com.works.entities.PiggyBank;
import com.works.repositories.PiggyBankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KumbaraService {


    final PiggyBankRepository piggyBankRepository;

    //Kumbara listeleme metodu
    public List<PiggyBank> allPiggyBank(){

        return piggyBankRepository.findAll();

    }
    public PiggyBank piggyBankSave(PiggyBank piggyBank){

        return piggyBankRepository.save(piggyBank);
    }
}
