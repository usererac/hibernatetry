package hello;

import java.util.*;
import java.util.function.Predicate;

public class ScopeDemo extends Thread {

    public static void main(String... args) {

        List<String> continents = new ArrayList<>();
        continents.add("mahesh");
        continents.add("mahesh");
        continents.add("mahesh");
        continents.add("mahesh");
        continents.add("mahesh");

        continents.forEach(System.out::println);

        Predicate<Integer> checkEvent = new Predicate<Integer>(){
          public boolean test(Integer i ){

              return false;
          }
        };


    }


}
