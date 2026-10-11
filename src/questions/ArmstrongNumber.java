package questions;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        //int number = scanner.nextInt();
        //int digitCount = countDigits(number);
        //System.out.println(digitCount);
        //boolean isArmstrong = isArmstrongNumber(number, digitCount);
        //System.out.println(isArmstrong);
        for(int i=100;i<=500;i++){
            int count = countDigits(i);
            if(isArmstrongNumber(i,count)){
                System.out.print(i+",");
            }

        }
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrongNumber(int number, int digitCount) {
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number = number / 10;
        }
        return sum == originalNumber;
    }
}
