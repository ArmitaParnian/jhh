package java;
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.Flow;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        double testPrice = 120.0;
        Predicate<Double> is = price -> price > 100;
        Function<Double, Double> apply = price -> price *0.9;
            
        Consumer<Double> print = price->{

            System.out.println("final price after discount:$" + price + 1.05);
        };
        if(is.test(testPrice)){
            System.out.println("The order is eligible for a discount .");
        }
        else{
            System.out.println("The odrder is not eligible for a discount.");
        }
    }
}
