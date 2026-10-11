package IntroTopics;
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args){
        int[] arr1 = new int[5];
        System.out.println(arr1.toString());
        System.out.println(Arrays.toString(arr1));
        int[] arr2;
       // System.out.println(arr2.length); with out initilized arr2 is not created
        arr2 = new int[6];
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = null;
        //arr3 = new int[2]; // if we don't initilize it returns null
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3); // returns null value
        // to get the length of array(arr1)
        System.out.println(arr1.length);
        //System.out.println(arr3.length);  with out initilized arr3 is not created
        int[] arr4 = {1,2,3,4,5};
        System.out.println(arr4.length);
        //get the elements of array
        // for each loop or Enhanced for loop
        for(int value:arr4){
            System.out.println(value);
        }
        //get
        System.out.println("printing using index :");
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        System.out.println(arr4[3]);
        System.out.println(arr4[4]);

        //set update
        arr4[0] = 10;
        arr4[1] = 20;
        arr4[2] = 30;
        arr4[3] = 40;
        arr4[4] = 50;

        //get
        System.out.println("printing using index :");
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        System.out.println(arr4[3]);
        System.out.println(arr4[4]);
        //System.out.println(arr4[5]); Raise an error of index out of bounds because array size is 5 so due to zero(0) indexing its last index should be 4

        for(int i = 0; i < arr4.length; i++){
            System.out.println("Using for loop:"+arr4[i]);
        }
        for(int i = arr4.length-1; i>=0; i--) {
            System.out.println("Using for loop in reverse :" + arr4[i]);
        }
        //get the elements of array
        // for each loop
        //forward only
        //using this kind of for loop is for read only

        for(int value:arr4){
            System.out.println("using for each loop : "+value);
        }

        int[] arr5 = arr4;
        arr5[3] = 100;
        System.out.println(arr5[3]);
        int i = 0;
        int j = 2;
        System.out.println("----------------------------CASE 1---------------------");
        System.out.println("Before Swap "+arr4[i]+","+arr4[j]);
        swap(arr4,i,j);
        System.out.println("After Swap "+arr4[i]+","+arr4[j]);
//----------------------------------------------------------------------------------------------
        System.out.println("----------------------------CASE 2---------------------");
        System.out.println("Before Swap "+arr4[i]+","+arr4[j]);
        swap(arr4[i],arr4[j]);
        System.out.println("After Swap "+arr4[i]+","+arr4[j]);

        System.out.println("---------------------------CASE 3------------------------");
        int[] other = {100,200,300};
        System.out.println(arr4[0]+","+other[0]);
        swap(arr4,other);
        System.out.println(arr4[0]+","+other[0]);

    }
        public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    public static void swap(int i,int j){
        int temp = i;
        i = j;
        j = temp;
    }

    public static void swap(int[] one , int[] two){
        int[] temp = one;
        one = two;
        two = temp;
    }
}
