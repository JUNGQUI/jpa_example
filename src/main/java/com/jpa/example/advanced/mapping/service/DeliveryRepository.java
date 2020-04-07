package com.jpa.example.advanced.mapping.service;

import com.jpa.example.advanced.mapping.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
