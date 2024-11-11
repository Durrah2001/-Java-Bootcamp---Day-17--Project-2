package org.project2;

public class NonSubscriberPassengers extends Passenger {

    private boolean discount_coupon = true;

    public NonSubscriberPassengers(String name, String ID, boolean discount_coupon) {
        super(name, ID);
        this.discount_coupon = discount_coupon;
    }


    //Abstract method
    @Override
    public void reserveCar(Car car) throws Exception {

        if (car.getMax_capacity() == 0) {
            throw new Exception("All sets are full in this car..it has reached to maximum capacity.");
        }

        super.setReserved_car(car);  //reserve car object to the passenger
        if (discount_coupon) {

            super.setTrip_cost(car.getRoute().getTrip_price() - car.getRoute().getTrip_price() * 0.1);
            //gets a 10% discount on the trip cost if they have coupon

        } else {
            super.setTrip_cost(car.getRoute().getTrip_price());
            //The trip cost will be same as a route price
        }

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
