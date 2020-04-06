package com.jpa.example.advanced.mapping.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "MEMBER")
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany
    private List<Order> orders;

}
