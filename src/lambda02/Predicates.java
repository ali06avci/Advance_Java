package lambda02;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        List<String> languages=new ArrayList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("C++");
        languages.add("Python");
        languages.add("Fortran");
        languages.add("Pascal");

        Predicate<String> hasFourChars=language->language.length()==4;
        languages.removeIf(hasFourChars);

        //four letter word is removed
        System.out.println(languages);
    }
}