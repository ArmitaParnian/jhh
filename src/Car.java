import java.util.*;
import java.io.*;
import java.math.*;
import java.util.function.*;
class Vehicle{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter your number");
        int number = reader.nextInt();
        Predicate<Integer> isEven = num ->num%2==0;
        if(isEven.test(number)){
            System.out.println("Zoj");
        }
        else{
            System.out.println("Fard");
        }
    }

}
