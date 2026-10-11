package questions;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the input value: ");
        int input = scn.nextInt();
        if(input%2==0){
            System.out.println("Its a Even Number");
        }
        else{
            System.out.println("Its a Odd Number");
        }
    }
}
