package com.works.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Kid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long kid;
    private String name;
    private String surname;
    private Integer age;
    private String classno;
    private String country;
    private String city;
}
