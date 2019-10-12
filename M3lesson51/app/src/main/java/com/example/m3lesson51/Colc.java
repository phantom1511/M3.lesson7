package com.example.m3lesson51;

import java.io.Serializable;

public class Colc implements Serializable {

    String plus;
    String minus;

    public Colc(String plus, String minus) {
        this.plus = plus;
        this.minus = minus;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getMinus() {
        return minus;
    }

    public void setMinus(String minus) {
        this.minus = minus;
    }
}
