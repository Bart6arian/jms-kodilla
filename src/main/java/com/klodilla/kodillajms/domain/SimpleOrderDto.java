package com.klodilla.kodillajms.domain;

public class SimpleOrderDto {

    private double value;
    private int id;

    public SimpleOrderDto(double value, int id) {
        this.value = value;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

}
