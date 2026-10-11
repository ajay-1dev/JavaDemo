package questions;
import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number :");
        int input = scn.nextInt();
        int answer = 0;
        while(input>0){
            int rem = input%10;
            answer = answer*10+rem;
            input = input/10;
        }
        System.out.println(answer);
    }
}
