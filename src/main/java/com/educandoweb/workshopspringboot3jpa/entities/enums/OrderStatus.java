package com.educandoweb.workshopspringboot3jpa.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT("Waiting"),
    PAID("Paid"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered"),
    CANCELED("Canceled");

    private String status;

    private OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static OrderStatus toEnum(String status) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getStatus().equals(status)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus parameter");
    }
}
