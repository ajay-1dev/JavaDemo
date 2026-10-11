package TCS;

import java.util.Arrays;

public class ZeroAtLast {
    public static void main(String[] args) {
        int[] arr = {1,0,30,4,5,0,9,0,1};
        ZeroAtLast zeroAtLast1 = new ZeroAtLast();
        zeroAtLast1.zeroAtLast(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void zeroAtLast(int[] arr){
        int j=0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            else{
                arr[j]=arr[i];
                j++;
            }
        }
        int i = arr.length-1;
        while(count>0){
            arr[i]=0;
            i--;
            count--;
        }
    }
}
