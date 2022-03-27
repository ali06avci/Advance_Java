package lambda02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {

        List<User> users=List.of(
                new User("Ali",Gender.MALE),
                new User("Alice",Gender.FEMALE),
                new User("Maria",Gender.FEMALE),
                new User("John", Gender.MALE)
        );

        // find out How many female
        //imperative approach

        List<User> females=new ArrayList<>();

        for(User user:users) {
            if(Gender.FEMALE.equals(user.gender)) {
                females.add(user);
            }
        }

        for(User female:females) {
            System.out.println(female);
        }

        //DECLARATIVE
        //much concise
        //more clean

        users.stream().filter(user->user.gender.equals(Gender.FEMALE)).
                collect(Collectors.toList()).forEach(System.out::println);

    }

    static class User{
        private final String name;
        private final Gender gender;
        public User(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "User [name=" + name + ", gender=" + gender + "]";
        }
    }
    enum Gender{
        FEMALE,MALE
    }
}

