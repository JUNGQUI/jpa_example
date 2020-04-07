package com.jpa.example.advanced.mapping.service;

import com.jpa.example.advanced.mapping.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
