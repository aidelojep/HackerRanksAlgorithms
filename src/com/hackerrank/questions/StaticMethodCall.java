package com.hackerrank.questions;

public class StaticMethodCall {
    public static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public static int sub(int x, int y){
        int sub = x - y;
        return sub;
    }
    public static int setSum(){

        int setSum = sum(10,9) - sub(5,2);

        return setSum;
    }
    public static void main(String[] args) {
        System.out.println("The value of sum is: " + sum(4,5));
        System.out.println("The value of sub is: " + sub(10, 9));
        System.out.println("The value of the new setSum is: " + setSum());

    }
}
