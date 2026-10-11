package TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrimenumbersFromFibonumbers {
    	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    List<Integer> ans = new ArrayList<>();
		int a =  0;
		int b = 1;
		PrimenumbersFromFibonumbers fun = new PrimenumbersFromFibonumbers();
		for(int i=1;i<=n;i++){
            System.out.print(a+" ");
		    if(fun.isPrime(a))
		    ans.add(a);
		    b=a+b;
		    a=b-a;
		}
        System.out.println();
		System.out.println(ans);
	}
	public boolean isPrime(int a){
	    for(int i=2;i*i<=a;i++){
	        if(a%i==0)
	        return false;
	    }
	    return true;
	}
}
