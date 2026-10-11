package TCS;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<1000){
            double discount = 1000 * 5/100;
            System.out.printf("%.2f%n",num-discount);
        }
        else if(num>=1000 && num < 5000){
            double discount = num * 10/100;
            System.out.printf("%.2f%n",num-discount);
        }
        else if(num>=5000){
            System.out.printf("%.2f",num-num*0.15);
        }
    }
}
