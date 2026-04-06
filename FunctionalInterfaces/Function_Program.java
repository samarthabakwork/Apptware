package FunctionalInterfaces;

import java.util.function.Function;

public class Function_Program {
    public static void main(String args[]){
        Function<Integer,String> convert= num->"Number :"+num;
        System.out.println(convert.apply(10));
        System.out.println(convert.apply(11));

    }
}

