package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinInDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        MaxMinInDigit maxMinInDigit = new MaxMinInDigit();
        System.out.println(Arrays.toString(maxMinInDigit.maxmin(n))); 

    }
    int[] maxmin(int n){
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(n>0){
            int rem = n%10;
            min = Math.min(min, rem);
            max = Math.max(max, rem);
            n=n/10;
        }
        return new int[]{min,max};
    }
}
