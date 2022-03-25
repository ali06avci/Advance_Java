package lambda02;

import java.util.List;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        Consumer<Integer> display=a->System.out.println(a);
        display.accept(100);

        Consumer<List<Integer>> modify= list->{
            for (int i = 0; i < args.length; i++) {
                list.set(i,2*list.get(i));
            }
        };
        List<Integer> intList=List.of(1,2,3,4,5);
        modify.accept(intList);
    }
}