import java.util.*;
import java.io.*;
import java.util.Function.*;
public class Ma {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        FileWriter writer = null;
        try{
            writer = new FileWriter(file);
            writer.write()
    }
    }
}
package java;
import java.util.*;
        import java.io.*;

public class ar {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        List<Integer> numbers = List.of(1,2,3,4);
        numbers.stream()
                .filter( x -> x%2==1)
                .map(x ->x*x)
                .reduce(0,(Integer,Integer2 ) -> Integer2 *2);
    }
}
