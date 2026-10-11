package IntroTopics;

public class UnaryOperators {
    public static void main(String[] args){
        //Unary operators are used with one operand. for example : ++
        int num = 5;
        ++num;
        System.out.println(num);
        int a = 12, b = 12;
        int res1, res2;
        res1 = ++a;  //increment
        res2 = --b;  //decrement
        System.out.println(res1+" "+res2);
        //+ Unary plus:
        //!
        System.out.println(++a); //a is incremented and returned
        System.out.println(b++); //b is returned and then increment
        }
    }
