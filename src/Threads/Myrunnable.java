package Threads;

public class Myrunnable implements Runnable {
    @Override
    public void run(){
        for( int i=0;i<5;i++){
        System.out.println("hey man am runnable thread !");
        }
    }
    
}

