package IntroTopics;

public class IfElse {
    public static void main(String[] args){
        boolean primeSubs = true;
        boolean netflixSubs=true;
        if(primeSubs){
            System.out.println("Welcome to the prime subscription");
        }
        else if(netflixSubs){
            System.out.println("Welcome to the Netflix subscription");
        }
        else{
            System.out.println("please become a member of amazon prime now.");
        }
    }
}
