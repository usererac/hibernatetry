package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String... args) {
        printMyName("Jack");
    }

    private static void printMyName(String name) {
       /* final String name1 = name + "Nelson";

        Runnable r = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome:" + name1);
        };
        new Thread(r).start();
        System.out.println("Your name is :" + name1);*/

        // lambda demo
/*
        List<String> elements = Arrays.asList("1","2","3","4");
        String result = elements.stream().reduce("",String::concat);
        System.out.println(result);*/


       /* List<Integer> values = (List<Integer>) Arrays.asList(10, 40, 20, 60, 80, 30, 40).stream()
                .filter(value -> value > 18)
                .sorted()
                .sequential()
                .map(Integer::new)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(values.toString());*/


       /*Function<String, Integer> length = (s)-> s.length();
       Function<Integer, Boolean> condition = (i)->i<10;
       Function<String, Boolean> function = length.andThen(condition);
        System.out.println("oout come is : "+function.apply("Java 8"));*/

       List<Integer> numbers = Arrays.asList(1,2,3,4,5);
       List<Integer> result = numbers.stream().skip(2).collect(Collectors.toCollection(ArrayList:: new));
        System.out.println(result.toString());

    }
}
