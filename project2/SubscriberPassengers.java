package org.project2;

public class SubscriberPassengers extends Passenger {


    public SubscriberPassengers(String name, String ID) {
        super(name, ID);
    }


    @Override
    public void reserveCar(Car car) throws Exception {

        if (car.getMax_capacity() == 0) {
            throw new Exception("All sets are full in this car..it has reached to maximum capacity.");
        }

        super.setReserved_car(car);
        super.setTrip_cost(car.getRoute().getTrip_price() * 0.5);  //Take 50% discount on trip cost

    } //End reserveCar method

    @Override
    public void displayInfo() {
        System.out.println("---------------Passenger Information---------------");
        System.out.println("Passenger name: " + super.getName());
        System.out.println("Passenger ID: " + super.getID());
        System.out.println("Car code: " + super.getReserved_car().getCode());
        System.out.println("Pick-up address: " + super.getReserved_car().getRoute().getPickUp_address());
        System.out.println("Destination address: " + super.getReserved_car().getRoute().getDest_address());
        System.out.println("Route price: " + super.getReserved_car().getRoute().getTrip_price());
        System.out.println("Trip cost: " + super.getTrip_cost());
        System.out.println("---------------------------------------------------");

    }//End method


}//End class
