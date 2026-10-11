package IntroTopics;
import java.util.*;
public class FunctionsDemo {
    public static void main(String[] args){
        greetingHello();
        int ans=addNumbers(1,2);
        System.out.println("addition of two values : "+ans);
        ans = addNumbers(10,11,12);
        System.out.println("addition of two values : "+ans);
        double square = Math.sqrt(4);
        System.out.println(square);
        int check = 2;
        System.out.println(check==square);
    }
    public static void greetingHello(){
        System.out.println("greeting hello method called");
        System.out.println("Hello ! hope you doing well");
    }
    public static int addNumbers(int a,int b){
        return a+b;
    }

    public static int addNumbers(int a,int b,int c){
        return a+b+c;
    }
}
