package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitsDemo {
    public static void main(String... args){

       /* Stream.of("mango","orange","Banana")
                .filter(fruit->{
                    System.out.println("fruit : "+ fruit);
                    return true;
                });*/

        List<String> fruits = new ArrayList<String>();
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("banana");

        Stream<String> fruitStrem = fruits.parallelStream();
        fruitStrem.filter(fruit->{
            System.out.println("fruit:"+fruit);
            return false;
        }).forEach(fruit->{});


    }
}
