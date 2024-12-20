import java.util.*;
import java.util.function.*;
import java.io.*;

public class Mother {
    public static void main(String[] args) {
        Scanner reader=new Scanner(Syste.in);

        Predicate<Book> best = book -> book.rate == 13.00;
        boolean result = best.test(new Book("test","test",20));
        System.out.println(result);
    }
}
