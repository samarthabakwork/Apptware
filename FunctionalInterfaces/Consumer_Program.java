package FunctionalInterfaces;

import java.util.function.Consumer;

public class Consumer_Program {

    public static void main(String args[]){
        Consumer<String> greet= name->System.out.println("Hello "+name);
        greet.accept("Santosh");

    }
}
