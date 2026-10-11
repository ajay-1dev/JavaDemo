package IntroTopics;

public class SwitchDemo {
    public static void main(String[] args){
        int number =29;
        String size;
        switch(number){
            case 29:
                size="Small";
                break;
            case 42:
                size="Medium";
                break;
            case 48:
                size="Large";
                break;
            case 50:
                size="ExtraLarge";
                break;
            default:
                size="Unknown";
                break;
        }
        System.out.println(size);
    }
}
