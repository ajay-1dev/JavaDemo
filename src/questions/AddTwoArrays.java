package questions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoArrays {
    public static void main(String[] args) {
         int[] arr1 = {9,9,5,8};
         int[] arr2 = {6,7};
         ArrayList<Integer> ans = new ArrayList<>();
         int carry = 0;
         int i = arr1.length-1;
         int j = arr2.length-1;
         while(i>=0||j>=0){
             int sum =0;
             if(i>=0){
                 sum+=arr1[i];
             }
             if(j>=0){
                 sum+=arr2[j];
             }
             sum+=carry;
             ans.add(0,sum%10);
             carry=sum/10;
             i--;
             j--;
         }
         if(carry!=0){
             ans.add(0,carry);
         }
        System.out.println(ans);
    }
    }