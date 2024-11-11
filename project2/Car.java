package org.project2;

public class Car {

    private String code;
    private int max_capacity;
    private Route route;

    public Car(String code, int max_capacity, Route route) {
        this.code = code;
        this.max_capacity = max_capacity;
        this.route = route;
    }


    public int getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
} //End class
