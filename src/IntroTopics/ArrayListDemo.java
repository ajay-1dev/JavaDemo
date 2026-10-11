package IntroTopics;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList<Type> Variablename = new ArrayList<>();
        ArrayList<Integer> Ilist = new ArrayList<>();
        ArrayList<String> Slist = new ArrayList<>();

        //add elements
        Slist.add("Java");
        Slist.add("Javascript");
        Slist.add("Swift");

        System.out.println(Slist);

        //access the elements from ArrayList
        for(int i =0; i< Slist.size();i++){
            System.out.println(Slist.get(i));
        }
        System.out.println("accesing the elements using enhanced for loop");
        for(String s:Slist){
            System.out.println(s);
        }

        //change the elements in Arraylist
        // reversing the arraylist
        int i = 0;
        int j = Slist.size()-1;
        while(i<j){
            String temp = Slist.get(i);
            Slist.set(i,Slist.get(j));
            Slist.set(j,temp);
            i++;
            j--;
        }
        System.out.println(Slist);

        //changing the element or replacing the element
        Slist.set(1,"C++");
        System.out.println(Slist+" Size of ArrayList: "+Slist.size());

        //removing the element from arraylist
        Slist.remove(2);
        System.out.println(Slist+" Size of ArrayList: "+Slist.size());

        //adding elements at specific index
        Slist.add(1,"Python");
        System.out.println(Slist);

    }
}
