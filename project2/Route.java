package org.project2;

public class Route {

    private String pickUp_address;
    private String dest_address;
    private double trip_price;

    //Constructor
    public Route(String pickUp_address, String dest_address, double trip_price) {
        this.pickUp_address = pickUp_address;
        this.dest_address = dest_address;
        this.trip_price = trip_price;
    }

    public String getPickUp_address() {
        return pickUp_address;
    }

    public String getDest_address() {
        return dest_address;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setPickUp_address(String pickUp_address) {
        this.pickUp_address = pickUp_address;
    }

    public void setDest_address(String dest_address) {
        this.dest_address = dest_address;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }


} //End class
