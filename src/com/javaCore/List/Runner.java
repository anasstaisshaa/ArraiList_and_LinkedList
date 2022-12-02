package com.javaCore.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Double> array_list = new ArrayList<>();
        List<Double> linked_list = new LinkedList<>();

        final int COUNT_ADD = 1_000_000;
        final int COUNT_GET = 1000;

        for (int i = 0; i < COUNT_ADD; i++) {
            array_list.add(Math.random());
            linked_list.add(Math.random());
        }
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < COUNT_GET; i++) {
            array_list.get((int) (Math.random() * COUNT_ADD) - 1);
        }
        System.out.println("Time for get 1000 elements from ArrayList");
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT_GET; i++) {
            linked_list.get((int) (Math.random() * COUNT_ADD - 1));
        }
        System.out.println("Time for get 1000 elements from LinkedList");
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
