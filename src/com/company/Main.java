package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //метод 1
        System.out.println("метод 1");
        ArrayList<Integer> nums = new ArrayList<>();
        int n = 0;
        int m = 0;
        do {
            m = (int) (1 + Math.random() * 100);
            nums.add(m);
            n = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) == m) {
                    n++;
                }
            }
        } while (n < 3);
        System.out.println(nums);

//метод 2
        System.out.println("мутод 2");
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] counts = new int[101];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        int el = 0;
        int cnt = 0;
        while (cnt < 3) {
            el = (int) (1 + Math.random() * 100);
            numbers.add(el);
            counts[el]++;
            cnt = counts[el];
        }
        System.out.println(numbers);

    }
}
