package com.works.repositories;

import com.works.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByCidEquals(Long cid);

    Optional<Customer> findByEmailEqualsIgnoreCaseAndPasswordEquals(String email, String password);





}