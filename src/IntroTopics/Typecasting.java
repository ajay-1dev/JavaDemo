package IntroTopics;

public class Typecasting {
    public static void main(String[] args){
        //case 1
       byte by = 10;
       short sh = 10;
       int in = 10;
       long lo = 10;
       //bigger data types cant be coverted to smaller datatypes automatically
        // by = sh
       sh = by;
       in = by;
       lo = by;
       lo = sh;
       lo = in;

       //case 2
        //implict type casting (automatically)
        by = 100;
        //for(byte b=0;b<=127;b++){
        //  System.out.println(b);
        //}
        //case 3
        float f = 5.6f;
        double d = 6.7;
        //f = d;
        d = f;
        //case 4
        in = (int)f;
        byte b = (byte)130;
        System.out.println("byte value :"+b);

        //case 5
         char ch = 'a';
         in = ch; //implicit typecasting automatically
         System.out.println(in);
         System.out.println(ch);
         System.out.println((int)ch);

         ch = 70; //implicit typecasting automatically
         System.out.println(ch);
         System.out.println((int) 200);

         ch = (char)(ch+1);
         System.out.println(ch);

         ch = 'a' + 1;//b
        ch = (char)('a'+ch);
        System.out.println(ch);

        System.out.println(10+20+"Hello"+10+20);
        System.out.println(2+' '+5);
        System.out.println(2+" "+5);
        System.out.println("hello"+'\t'+"world");
        System.out.println(2+'\t'+3);
    }
}
