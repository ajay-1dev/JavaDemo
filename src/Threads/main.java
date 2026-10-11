package Threads;

public class main {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Thread t2 = new Thread(new Myrunnable());
        t1.start();
        //t1.run(t1);
        t2.start();
        try{
        t1.join();
        t2.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("executed sucessfully");
    }
}