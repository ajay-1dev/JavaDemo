package questions;

import java.util.ArrayList;

public class InsertionOfArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {10,19,20,30,40,40,40,50};
        int[] arr2 = {15,16,17,18,20,25,30,30,40};
        ArrayList<Integer> Result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i]==arr2[j]){
                Result.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(Result);
    }
}
