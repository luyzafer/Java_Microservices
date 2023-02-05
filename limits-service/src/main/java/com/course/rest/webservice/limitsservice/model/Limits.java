package com.course.rest.webservice.limitsservice.model;

import org.springframework.context.annotation.Bean;

public class Limits {

    private int min;
    private int max;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Limits(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Limits() {
    }

    @Override
    public String toString() {
        return "Limits{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
