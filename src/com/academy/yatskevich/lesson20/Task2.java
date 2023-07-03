package com.academy.yatskevich.lesson20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<LocalDate> holidays = new ArrayList<>();

        holidays.add(LocalDate.of(2023, 1, 1));
        holidays.add(LocalDate.of(2023, 1, 2));
        holidays.add(LocalDate.of(2023, 1, 7));
        holidays.add(LocalDate.of(2023, 3, 8));
        holidays.add(LocalDate.of(2023, 4, 25));
        holidays.add(LocalDate.of(2023, 5, 1));
        holidays.add(LocalDate.of(2023, 5, 9));
        holidays.add(LocalDate.of(2023, 7, 3));
        holidays.add(LocalDate.of(2023, 11, 7));
        holidays.add(LocalDate.of(2023, 12, 25));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        holidays.stream().map(formatter::format).forEach(System.out::println);
    }
}
