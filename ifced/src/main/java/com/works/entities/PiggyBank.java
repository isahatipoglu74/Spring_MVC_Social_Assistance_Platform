package com.works.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


    @Data
    @Entity
    public class PiggyBank {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long pbid;
        private String number;
        private String person;
        private String mobile;
        private String email;
        private String postcode;
        private String note;
    }
