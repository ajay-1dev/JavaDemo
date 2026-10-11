package questions;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the input value : ");
        int input = scn.nextInt();
        boolean flag = false;
        for(int i=2;i<input;i++){
            if(input%i==0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Not a Prime Number");
        }
        else{
            System.out.println("It's a Prime Number");
        }
    }
}
