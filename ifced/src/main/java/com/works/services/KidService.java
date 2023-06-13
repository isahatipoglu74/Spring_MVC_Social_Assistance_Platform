package com.works.services;

import com.works.entities.Kid;
import com.works.entities.PiggyBank;
import com.works.repositories.KidRepository;
import com.works.repositories.PiggyBankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KidService {

    final KidRepository kidRepository;

    //Kumbara listeleme metodu
    public List<Kid> allKids(){

        return kidRepository.findAll();

    }
    public Kid kidSave(Kid kid){

        return kidRepository.save(kid);
    }
}
