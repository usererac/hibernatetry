package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SuppelierDemo {

    public static void main(String... args){
        List<String> users = new ArrayList<String>();
        users.add("jack");
        users.add("jill");
        users.add("ram");

        users.stream().forEach((name)->{showSupplier(()->name);
        });
    }
    public static void showSupplier(Supplier<String> name){
        System.out.println("Welcome:"+name.get());
    }
}
