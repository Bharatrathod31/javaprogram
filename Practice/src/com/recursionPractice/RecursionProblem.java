package com.recursionPractice;

public class RecursionProblem {

    public int add(int number){
        // base condition
        if (number == 1) {
            return 1;
        }
        // recursive condition 
        return number + add(number-1);
    }
    public int factorial(int number){
        // base condition
        if (number == 1) {
            return 1;
        }
        // recursive condition 
        return number * factorial(number-1);
    }

}
