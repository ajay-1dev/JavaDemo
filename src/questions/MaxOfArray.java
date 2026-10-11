package questions;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {4,5,3,1,9};
        int max = Integer.MIN_VALUE;
        max=maximum(arr,max);
        System.out.println("maximum value of array : "+max);
        int min = Integer.MAX_VALUE;
        min = minimum(arr,min);
        System.out.println("minimum value of array : "+min);
    }
    public static int maximum(int[] arr,int max){
        for(int i = 0;i < arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int minimum(int[] arr , int min){
        for(int i = 0;i < arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
