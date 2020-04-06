package com.jpa.example.advanced.mapping.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "ORDERS")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Member member;
    @OneToMany
    private List<OrderItem> orderItems;
    @OneToOne
    private Delivery delivery;

    private Date orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
