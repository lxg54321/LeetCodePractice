package com.lxg;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {100, 100, 71};
        int target = 49;
        float result = new TestSmart().calculateB(numbers, target);
        System.out.println(result);
    }

}
