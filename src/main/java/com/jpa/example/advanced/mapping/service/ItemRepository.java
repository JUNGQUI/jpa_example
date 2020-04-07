package com.jpa.example.advanced.mapping.service;

import com.jpa.example.advanced.mapping.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
