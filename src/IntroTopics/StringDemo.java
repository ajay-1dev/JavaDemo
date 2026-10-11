package IntroTopics;

import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {
        //String literal method
        String first = "Java";
        String second = "Python";
        String third = "Java";
        //print
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        //using new keyword
        //String stringName = new String("string_value");
        String str = new String("Dummy");
        System.out.println(str);

        //String operatioms
        String greet = "Hello World!";
        System.out.println("String: "+greet);
        System.out.println(greet.length());

        // joining two strings
        String joinedString = first.concat(" "+second+" "+third);
        System.out.println(joinedString);

        //compare two Strings
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));


        String name1 = new String("Program1");
        String name2 = new String("Program1");
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);


        String n1 =  new String("program2");
        String n2 = n1;
        System.out.println(n1.equals(n2));
        System.out.println(n1==n2);


        String n3 = new String(third);
        System.out.println(n3==third);
        System.out.println(n3.equals(third));

        //escape characters
        String example = "this is a \"very\"important project";
        System.out.println(example);

        //immutability
        //In java Strings are immutable. This means once we create a string we cannot change String

        String example1 = "Hello";
        example1 = example1.concat(" World!");
        System.out.println(example1);

        //printing using indexing for String
        String newStr = "Hello";
        System.out.println(newStr.charAt(2));

        for(int i = 0;i < newStr.length(); i++){
            System.out.print(newStr.charAt(i)+" ");
        }
        System.out.println();
        //substring : gives the part of  string and in continous part of string
        //range : --> length variablename.substring(start , ending-1);example v1.substring(2,5);
        //it prints from 2 to 5-1
        System.out.println(newStr.substring(1,4));

        System.out.println(newStr.lastIndexOf('l'));
        System.out.println(newStr.startsWith("He"));

        String s1 = "Hello";
        String s2 = s1;
        String s3 = "Hello";
        String s4 = new String("Hello");
        System.out.println((s1 == s2)+","+s1.equals(s2));
        System.out.println((s1 == s3)+","+s1.equals(s3));
        System.out.println((s1 == s4)+","+s1.equals(s4));
    }
}
