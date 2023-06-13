package com.works.repositories;

import com.works.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

    Optional<Manager> findByEmailEqualsIgnoreCaseAndPasswordEquals(String email, String password);

}