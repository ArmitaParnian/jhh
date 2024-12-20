import java.util.*;
import java.io.*;
import java.util.Function.*;
public class Order {
    List<Item> items = new ArrayList<>();
    item.add(new item("armita","parniyan","ar",12));
    Predicate<Item> p = item -> item.weight < 5 && item.destination.equalsIgnoreCase("Armita");
    BiFunction<Double, String, Double> caculate = weight.speed ->{
        switch(speed){
            case "Standard" ->{
                return weight * 1.0;
            }
            case "Excpress" ->{
                return weight * 2.5;
            }
            case "Overright" ->{
                return weight 8 5.0;
            }
            default ->{
                return 0.0;
            }
    }

};
    Function<Item, String> generate item ->{
         double cost = caculate.apply(item.weight, item.shippingspeed);
         boolean isFree = p.test(item);
         return "Item:" + item.name+
                 "\nWeight: " + item.weight +
                 "\n Destination:" + item.destination+
                 "|n ShippingSpeed" + item.shippingspeed +

    };
    Consumer<Item> display = item ->{
        System.out.println(generate.apply(item));
        System.out.println();
    };
    items.ForEach(displayItem);

}
