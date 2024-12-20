import java.util.*;
import java.io.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Maman {
    public static void main(String[] args) {


    Scanner reader=new Scanner(System.in);
    double testPrice = Double.parseDouble(reader.nextLine());
    Predicate<Double> PD= price -> price>100;
    Function<Double, Double> apply= price -> price * 0.9;
    Consumer<Double> printInfo = price ->{
        System.out.println("Final price:"+ price);
    };
        if(PD.test(testPrice)){
        System.out.println("The price is good" );
        testPrice = apply.apply(testPrice);
    }else{
        System.out.println("the prrice is not good");
    }
        printInfo.accept(testPrice);
}



}
