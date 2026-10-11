package Threads;

public class Mythread extends Thread{
    public void run(){
        for( int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("hey man thread is executed sucessfully");
        }
       
    }
}

