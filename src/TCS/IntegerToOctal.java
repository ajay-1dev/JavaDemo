package TCS;

import java.util.Scanner;

public class IntegerToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = "new String".valueOf(num);
        try{
            System.out.println(Integer.valueOf(s,8));
        }
        catch(Exception e){
            System.out.println("invalid input");
        }
    }
}
