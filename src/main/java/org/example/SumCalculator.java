package org.example;


public class SumCalculator {
    public int sum(int n){
        if (n == 0) throw new  IllegalArgumentException("argument must be > 0");
        else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }


}
