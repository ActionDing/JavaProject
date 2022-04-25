package com.ding.stream;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreamAPI {

    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();

        Stream<Employee> stream = employees.stream();
        Stream<Employee> employeeStream = employees.parallelStream();
    }


    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);

        double f = 111231.5585;
        BigDecimal b = new BigDecimal("31.558");
        BigDecimal bigDecimal = b.setScale(1, RoundingMode.DOWN);
        double f1 = b.setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        System.out.println(bigDecimal);
        System.out.println(f1);
    }

    @Test
    public void test3() {
        Stream<Integer> integerStream = Stream.of(12, 2, 3, 5, 6);
    }

    @Test
    public void test4() {
        Stream.iterate(0, t -> t + 2).forEach(System.out::println);

        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }

}
