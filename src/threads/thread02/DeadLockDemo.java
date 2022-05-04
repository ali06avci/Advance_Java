package threads.thread02;
public class DeadLockDemo {

    public static void main(String[] args) {


        final String resource1="This is resource1";

        final String resource2="This is resource2";


        Thread thread1=new Thread(){
            @Override
            public void run() {
                synchronized (resource1) {

                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }

                }
            }
        };



        Thread thread2=new Thread(){
            @Override
            public void run() {
                synchronized (resource2) {

                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }

                }
            }
        };


        thread1.start();
        thread2.start();

    }



}