package questions;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        //A year is a considered a leap year
        //if year is exactly divisible by 400 or
        //if year is divisible by 4 and not divisible by 100
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Year Value: ");
        int Year = scn.nextInt();
        if(Year%400==0 || (Year%4==0 && Year%100!=0)){
            System.out.println("Its a Leap Year");
        }
        else{
            System.out.println("Its not a Leap Year");
        }
    }
}
