package hello;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String... args){

        Consumer<String> consumer = ConsumerDemo::showConsumer;

        consumer.accept("jack");
        consumer.accept("jill");
        consumer.accept("Ram");
    }

    public static void showConsumer(String name){
        System.out.println("Welcome:"+name);
    }
}
