package questions;
import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the values");
        int value1 = scn.nextInt();
        int value2 = scn.nextInt();
        int value3 = scn.nextInt();
        if(value1<=0 || value2<=0 || value3<=0 || value1+value2+value3!=180){
            System.out.println("Invalid Triangle");
        }
        else{
            System.out.println("Valid Triangle");
        }
    }
}
