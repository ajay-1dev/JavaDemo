package IntroTopics;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args){
        System.out.println("Hello");
        int val=10;
        System.out.println(val);
        System.out.println(5);
        System.out.println("I am " + "Awesome at programming");
        System.out.println("Number : "+val+val+1);
        //creating an object of scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int number=input.nextInt();
        System.out.println(number);
        float myFloat = input.nextFloat();
        double myDouble = input.nextDouble();
        String myString = input.next();


    }
}
