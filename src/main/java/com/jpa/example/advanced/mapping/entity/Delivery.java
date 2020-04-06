package com.jpa.example.advanced.mapping.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "DELIVERY")
public class Delivery extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Order order;
    private String city;
    private String street;
    private String zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
