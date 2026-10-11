package IntroTopics;

public class IterativeStatementsDemo {
    public static void main(String[] args){
        System.out.println("------------FOR LOOP----------");
        //for loop is used when you know exact no of iterations
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("------------WHILE LOOP----------");
        //for loop is used when you don't know exact no of iterations
        int j=1;
        while(j<=10){
            System.out.println(j++);
        }
        System.out.println("------------DO WHILE LOOP----------");
        int k = 6;
        int l = 5;
        do{
            System.out.println(k++);
        }while(k<=l);
    }
}
