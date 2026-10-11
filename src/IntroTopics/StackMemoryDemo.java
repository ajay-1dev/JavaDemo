package IntroTopics;

public class StackMemoryDemo {
    public static void main(String[] args) {
        System.out.println("Hello there!");
        greetings();
        askQuery();
        int DefaultVal = 2;
        DefaultVal = multiplyTwo(DefaultVal);
        System.out.println(DefaultVal);
        DefaultVal = multiplyFour(DefaultVal);
        System.out.println(DefaultVal);

    }

    public static int multiplyFour(int defaultVal) {
        defaultVal *= 4;
        return defaultVal;
    }

    public static int multiplyTwo(int val) {
        val *=2;
        return val;
    }

    public static void greetings(){
        System.out.println("Hope you are doing well");
    }
    public static void askQuery(){
        System.out.println("How may i help today");
    }
}
