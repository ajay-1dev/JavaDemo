package questions;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        ArrayList<Integer> First = new ArrayList<>();
        ArrayList<Integer> Second = new ArrayList<>();
        ArrayList<Integer> Result = new ArrayList<>();
        First.add(10);
        First.add(20);
        First.add(20);
        First.add(30);

        Second.add(20);
        Second.add(30);
        int k=0;
        for(int i = 0;i<First.size();i++){
            for(int j = k;j<Second.size();j++){
                if(First.get(i)<Second.get(j)){
                    break;
                }
                if(First.get(i).equals(Second.get(j))){
                    Result.add(First.get(i));
                    k=j+1;
                    break;
                }
            }
        }
        System.out.println(Result);
    }
}
