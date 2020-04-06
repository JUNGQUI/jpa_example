package com.jpa.example.advanced.mapping.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "ORDER_ITEM")
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Item item;
    @ManyToOne
    private Order order;

    private int orderPrice;
    private int count;
}
