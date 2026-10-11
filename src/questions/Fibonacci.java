package questions;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The value : ");
        int input = scn.nextInt();
        int first = 0;
        int second = 1;
        for(int i=3;i<=input+1;i++){
            int temp = second;
            second += first;
            first = temp;
        }
        System.out.println(second);
    }
}
