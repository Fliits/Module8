package functional;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}

public class Calculator {
    static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;

        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 3, 12, 7, 8, 9, 11);

        // Task 1
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average: " + average);
        double mean = average / numbers.size();
        System.out.println("Mean: " + mean);


        // Task 2
        List<Integer> oddNumbers = numbers.stream().filter(p -> p % 2 != 0).toList();
        oddNumbers.replaceAll(p -> p * 2);
        int sum = oddNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of doubled odd numbers: " + sum);
    }
}
