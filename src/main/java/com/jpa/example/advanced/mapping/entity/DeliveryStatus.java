package com.jpa.example.advanced.mapping.entity;

public enum DeliveryStatus {
    READY("준비"), COMPLETE("완료");

    private final String statusName;

    DeliveryStatus(String statusName) {
        this.statusName = statusName;
    }
}
