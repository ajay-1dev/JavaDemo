package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class SortthePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int size =sc.nextInt();
        sc.nextLine();
        String ref = sc.nextLine();
        String[] arr = ref.split(" ");
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = Integer.valueOf(arr[i]);
        }
        double row = Math.ceil(n/size);
        int[][] ref2 = new int[(int)row][size];
        int index =0;
        for(int i =0;i<ref2.length;i++){
            for(int j = 0;j<ref2[i].length;j++){
                ref2[i][j]=arr1[index];
                index++;
            }
        }
        Arrays.sort(ref2,(a,b) -> Integer.compare(a[0], b[0]));
            for (int i = 0; i < ref2.length; i++) {
            System.out.println(Arrays.toString(ref2[i]));
        };
        

    }
}
