package oops;

class Vehicles{                                                 // New Class  vehicles

    int wheels;
    int headlights;
    String color;


    Vehicles(int wheels) {                                                 // constructor of vehicles
        this.wheels = wheels;
          headlights    = 2;
    }
     Vehicles(int wheels, String color) {
         this.wheels = wheels;
         this.color = color;
         headlights = headlights;
     }
}

public class MyConstructor {

    MyConstructor() {                                                   // Default constructor of main class MY constructor
        System.out.println("object is now created");

    }

    public static void main (String[] args) {

     Vehicles car = new Vehicles(4);

     Vehicles scooty = new Vehicles(2);

     Vehicles eRikshaow = new Vehicles(8,"red");



     System.out.printf(("  color %d wheels %s") ,eRikshaow.wheels,eRikshaow.color);
    }
}
