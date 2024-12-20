

import java.util.*;
import java.io.*;
import java.util.function.*;

public class Book {

    public static void main(String[] args) {

    }
    String name;
    double weight;
    String destination;
    double shippingSpeed;
    double rate;
    public Book(String name, double weight, String destination, double shippingSpeed, double rate) {
        this.name = name;
        this.weight= weight;
        this.destination = destination;
        this.shippingSpeed= shippingSpeed;
        this.rate = rate;
    }

    @Override

    public String toString(){
        return "Shipping{"+
                "name="+name+'\''+
                ",weight="+weight + '\''+
                ",Overnight=" + destination+'\''+
                ",ShippingSpeed="+ shippingSpeed+'\''+
                "}";
    }
}
