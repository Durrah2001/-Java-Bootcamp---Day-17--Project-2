package org.project2;

public class Main {
    public static void main(String[] args) {

        //2 Routes
        Route route1 = new Route("Al-Olaya-202", "Al-Narjis-226", 58.0);
        Route route2 = new Route("Al-Nakheel-399", "Al-Yasmeen-182", 44.0);

        Car car1 = new Car("1131-RUA", 0, route1);
        Car car2 = new Car("7897-DVN", 5, route2);
        Car car3 = new Car("2100-MlO", 8, route1);
        

        //Apply polymorphism --- can't create an object of abstract class (Passenger)
        Passenger subPassenger = new SubscriberPassengers("Nada", "1116442982");
        Passenger nonSubPassenger1 = new NonSubscriberPassengers("Omar", "1110316312", true);
        Passenger nonSubPassenger2 = new NonSubscriberPassengers("Dema", "1114900932", false);

        /////////////////////////////////////////////////////////////////////////


        //Create an array of two type of passengers---(1 Subscriber and 2 Non-Sub passengers)
        Passenger[] passengers = new Passenger[3];

        passengers[0] = subPassenger;
        passengers[1] = nonSubPassenger1;  //Non-Sub passenger has a discount coupon
        passengers[2] = nonSubPassenger2;  //Non-Sub passenger doesn't have a discount coupon

        System.out.println();

        System.out.println("Subscriber passengers: \n");
        try {
            subPassenger.reserveCar(car2);        //Sub-passenger in car2
            subPassenger.displayInfo();

            /////////////////////////////////

            subPassenger.reserveCar(car3);       //Sub-passenger in car3
            subPassenger.displayInfo();

            /////////////////////////////////

            subPassenger.reserveCar(car1);       //No available set in car1 ---> maximum capacity = 0
            subPassenger.displayInfo();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("Non-Subscriber passengers: \n");
        try {
            nonSubPassenger1.reserveCar(car2);       //Non-Sub passenger has coupon in car2
            nonSubPassenger1.displayInfo();

            /////////////////////////////////

            nonSubPassenger2.reserveCar(car3);      //Non-Sub passenger doesn't have coupon in car3
            nonSubPassenger2.displayInfo();

            /////////////////////////////////

            nonSubPassenger1.reserveCar(car1);
            nonSubPassenger1.displayInfo();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    } //End main method

}//End class