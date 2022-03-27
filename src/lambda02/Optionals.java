package lambda02;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
//		String[] str=new String[10];
//		String str2=str[9].substring(1,5);
//
//		System.out.println(str2);

        String[] str=new String[10];

        Optional<String> isNull = Optional.ofNullable(str[9]);

        if(isNull.isPresent()) {
            String str2=str[9].substring(1,5);
            System.out.println("Substring is"+ str2);
        }
        else {
            System.out.println("Can not get substr of the empty string");
        }

        str[9]="JavaisCool";

        Optional<String> isNull2=Optional.ofNullable(str[9]);
        if(isNull2.isPresent()) {
            String str2=str[9].substring(1,5);
            System.out.println("Substring is"+ str2);
        }else {
            System.out.println("Can not get substr of the empty string");
        }
    }
}