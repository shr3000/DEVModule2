package org.example;

public class SumCalculator {
    public static int sum(int n){
        if (n == 0) throw new  IllegalArgumentException();
        else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
