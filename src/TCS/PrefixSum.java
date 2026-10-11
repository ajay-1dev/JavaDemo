package TCS;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {4,1,6,-2,7};
        int[] pre = new int[arr.length];
        
        for(int i=0;i<pre.length;i++){
            if(i==0){
                pre[0]=arr[0];
            }
            else{
            pre[i]=pre[i-1]+arr[i];
            }
        }
        System.out.println(Arrays.toString(pre));
    }
}
