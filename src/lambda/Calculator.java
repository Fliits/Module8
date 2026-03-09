package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}

public class Calculator {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;

        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 3, 12);

        List<Integer> oddNumbers = new ArrayList<>();
        numbers.forEach(p -> {
            if (p % 2 != 0) {
                oddNumbers.add(p);
            }
        });
        System.out.println(oddNumbers);
        oddNumbers.replaceAll(p -> p * 2);
        System.out.println(oddNumbers);
        AtomicReference<Integer> sum = new AtomicReference<>(0);
        oddNumbers.forEach(p -> sum.updateAndGet(v -> v + p));
        System.out.println(sum);
    }
}
