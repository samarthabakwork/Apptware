package OptionalClass;

import java.util.Optional;

public class Optional_Demo1 {
    public static void main(String args[]){
        String str="This is a String";
        Optional<String> opt=Optional.ofNullable(str);
        System.out.println(opt);
        System.out.println(opt.get());
        System.out.println(opt.orElse("This is Default Value"));
        System.out.println(opt.isEmpty());
        System.out.println(opt.isPresent());
    }
}
