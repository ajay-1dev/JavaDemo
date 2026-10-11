package TCS;

import java.util.ArrayList;
import java.util.List;

public class PrefixSumExample1 {
    public static void main(String[] args) {
        int[] arr = {-2,5,1,3,4,1,7,-8,2,0};
        int[][] query = {{3,8},{2,4},{0,3},{5,9},{6,6}};
        int[] prefix = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==0){
                prefix[i]=arr[i];
            }
            else{
                prefix[i] = prefix[i-1]+arr[i];
            }
        }
        PrefixSumExample1 prefixSumExample1 = new PrefixSumExample1();
        System.out.println(prefixSumExample1.solveQuery(query,prefix));

       
    }

    public List<Integer> solveQuery(int[][] query,int[] prefix){
        List<Integer> ans = new ArrayList<>();
         for(int i = 0;i<query.length;i++){
            int row = query[i][0];
            int col = query[i][1]; 
            if(row!=0){
           ans.add(prefix[col]-prefix[row-1]);
            }
            else{
                ans.add(prefix[col]);
            }
        }
        return ans;
    }
}
