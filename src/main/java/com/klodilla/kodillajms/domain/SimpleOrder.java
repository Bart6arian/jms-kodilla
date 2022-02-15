package com.klodilla.kodillajms.domain;

import org.springframework.beans.factory.annotation.Value;

public class SimpleOrder {

    private double value;
    private int id;

    public SimpleOrder(double value, int id) {
        this.value = value;
        this.id = id;
    }

    public SimpleOrder() {

    }

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }
}
