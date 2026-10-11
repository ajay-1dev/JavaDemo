package IntroTopics;

public class LogicalOperators {
    public static void main(String[] args){
        //logical operators are used to check whether the expression is true or false
        //they are used in decision making
        //1. && (Logical AND) expression1 && expression2
        //true only when both exp1 and exp2 are true
        System.out.println((5>3) && (9>8));
        System.out.println((5<3) && (9>0));

        //2. || (Logical OR) exp1 || exp2
        //true if exp1 or exp2 is true
        System.out.println((5<3)||(9>0)); //true
        System.out.println((5>3)||(9<0)); //true
        System.out.println((5<3)||(9<0)); //false

        //3. ! (Logical NOT) ! expression
        //true if exp is false and vice verse
        System.out.println(!(9==0));
        System.out.println(!(9==9));
    }
}
