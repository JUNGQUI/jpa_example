package com.jpa.example.advanced.mapping.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "orders")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    private Date orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
