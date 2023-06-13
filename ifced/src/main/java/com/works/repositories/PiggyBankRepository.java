package com.works.repositories;

import com.works.entities.PiggyBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiggyBankRepository extends JpaRepository<PiggyBank, Long> {

}