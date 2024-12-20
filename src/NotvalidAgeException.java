import java.util.*;
import java.io.*;
import java.util.function.Predicate;

public class NotvalidAgeException {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        Predicate<Integer> i = a -> a%2 ==0;
        boolean b = i.test(reader.nextInt());
        System.out.println(b);
    }
}
