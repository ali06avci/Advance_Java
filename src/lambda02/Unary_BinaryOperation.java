package lambda02;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Unary_BinaryOperation {
    public static void main(String[] args) {

        UnaryOperator<Person> unaryOperator=(person)->{
            person.setName("New Name");
            return person;
        };

        Person p=new Person();
        p.setName("Hello");

        Person pr = unaryOperator.apply(p);
        System.out.println(pr);

        BinaryOperator <Integer> bop=(a,b)->a>b?1:0;

        System.out.println(bop.apply(10,12));


        BinaryOperator<Integer> op= BinaryOperator.maxBy((a,b)->(a>b)?1:((a==b)?0:-1));

        System.out.println(op.apply(125,50));

    }

}
class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}