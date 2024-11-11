package org.project2;

public abstract class Passenger {

    private String name;
    private String ID;
    private double trip_cost;
    private Car reserved_car;


    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    //Abstract method
    // takes a car object to reserve it to the passenger
    //and compute the trip cost....must be implement in sub-classes
    public abstract void reserveCar(Car car) throws Exception;


    // Must be overridden
   // Display their information along with the car code and route price .
    public void displayInfo() {

        System.out.println("Display information about the passengers");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }

    public Car getReserved_car() {
        return reserved_car;
    }

    public void setReserved_car(Car reserved_car) {
        this.reserved_car = reserved_car;
    }


}//End class
