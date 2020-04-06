package com.jpa.example.advanced.mapping.entity;

public enum OrderStatus {
    ORDER("주문"), CANCEL("취소");

    private final String statusName;

    OrderStatus(String statusName) {
        this.statusName = statusName;
    }
}
