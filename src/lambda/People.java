package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator.*;
import java.util.Collection.*;
import java.util.*;

@FunctionalInterface
interface Comparator<T> {
    int compare(T a, T b);
}

public class People{

    public static class Person {
        private String name;
        private int age;
        private String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Comparator<Person> ageComparator = (a, b) -> Integer.compare(a.getAge(), b.getAge());

        List<Person> people = Arrays.asList(
            new Person("Alice", 30, "New York"),
            new Person("Brad", 21, "New York"),
            new Person("Bob", 25, "Los Angeles"),
            new Person("Charlie", 35, "Chicago")
        );

        people.sort(ageComparator::compare);
        System.out.println("Sorted by age:" + people);

        // Filter people from New York without the stream api
        List<Person> peopleFromNY = new ArrayList<>();
        for (Person person : people) {
            if (person.getCity().equals("New York")) {
                peopleFromNY.add(person);
            }
        }
        System.out.println("People from New York:" + peopleFromNY);
     }
}
