package IntroTopics;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(str);

        System.out.println(sb);
        System.out.println(sb.length()); //length() function is used to find the length of the string and stringbuilder
        System.out.println(sb1);
        System.out.println(sb1.length());


        //append
        sb1.append(" abc");
        System.out.println(sb1);
        sb1.append(" def");
        System.out.println(sb1);

        //insert
        //starts inserting from the mentioned index
        sb1.insert(5," 123");
        System.out.println(sb1);

        //setCharAt()
        //used to  replace the exesting character with new given character
        sb1.setCharAt(5,',');
        System.out.println(sb1);

        String str1 = sb1.toString();
        System.out.println(str1);

    }
}
