package lambda02;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {

        //first one is for arg, second one is for return
        Function<Long, Long> adder=(value)->value+3;

        Long result=adder.apply(9L);

        System.out.println("Result:"+result);


        BiFunction<Long, Long, Long> adder2=(val1,val2)->val1+val2;

        System.out.println(adder2.apply(5L, 3L));


    }

}