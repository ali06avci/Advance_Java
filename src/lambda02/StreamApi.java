package lambda02;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        //map is an intermediate operation that returns a stream
        //collect is a terminal operation that return the result of the intermediate operations
        List<Integer> numbers=Arrays.asList(2,5,9,3,16);

        List<Integer> sqrList=numbers.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(sqrList);

        numbers.stream().map(x->x*x).collect(Collectors.toList()).forEach(System.out::println);


        //filter
        List<String> names= Arrays.asList("String","Lambda","Java","Collection","Stream");
        List<String> filteredNames = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(filteredNames);


        //sorted
        List<Double> doubles =Arrays.asList(10.0,12.0,0.5,12.5,23.12,545.23);
        List<Double> sorted = doubles.stream().sorted().collect(Collectors.toList());

        System.out.println(sorted);

        //Terminal operations
        //collect
        List<Integer> integers=Arrays.asList(2,3,4,56);
        Set<Integer> intSet = integers.stream().map(i->i*5).collect(Collectors.toSet());
        System.out.println(intSet);

        //foreach
        List<Integer> integers2=Arrays.asList(2,3,4,56);
        integers2.stream().map(x->x*x).forEach(y->System.out.println(y));

        //foreach with method reference
        List<Integer> integers3=Arrays.asList(2,3,4,56);
        integers3.stream().map(x->x*x).forEach(System.out::println);

        //
        List<Integer> integers4=Arrays.asList(2,3,4,56);  //56,4,2
        int even = integers4.stream().filter(x->x%2==0)
                .reduce(0,(i,k)->i+k);

        //0+2;
        //2+4;
        //6+56
        System.out.println("sum of Even:"+even);

    }

}