// vacation.java

//create the abstract class "vacation"

abstract class vacation {

// declare the variable "destination" as string

private String destination;

// create the constructor

public vacation(String destination) {

this.destination = destination;

}

// create the "toString()"

public String toString() {

// return the "destination"

return "\nThe Destination is:" + destination;

}

// call the abstract method of "calculatecost"

public abstract double calculatecost();

}

// create the "allinclusive" class extend from the "vacation" class

class allinclusive extends vacation {

// declare the necessary data types

private String brand;

private int rating;

private double price;

// create the constructor of "allinclusive"

public allinclusive(String brand, int rating, double price, String destination) {

super(destination);

this.brand = brand;

this.rating = rating;

this.price = price;

}

// create the "toString()"

public String toString() {

// return the "brand","rating","price"

return super.toString() + " \nBrand : " + brand + "\n" + " Rating : " + rating + "\n" + " Price : " + price;

}

// return the "price" value

public double calculatecost() {

return price;

}

}

// create the "piecemeal" class extend from the "vacation" class

class piecemeal extends vacation {

// declare the necessary data types

private double hotel;

private double meal;

private double airfare;

// create the constructor of "piecemeal"

public piecemeal(double hotel, double meal, double airfare, String destination) {

super(destination);

this.hotel = hotel;

this.meal = meal;

this.airfare = airfare;

}

// create the "toString()"

public String toString() {

// return the "hotelcost","mealcost","airfarecost"

return super.toString() + "\n Hotel Cost: " + hotel + "\n" + " Meal Cost : " + meal + "\n" + " Airfare Cost : "

+ airfare;

}

// return the "calculatecost()"

public double calculatecost() {

return (hotel + meal + airfare);

}

}



