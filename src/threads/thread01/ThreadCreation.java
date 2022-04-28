package threads.thread01;
public class ThreadCreation {

    public static void main(String[] args) {

        System.out.println("Current Thread:"+Thread.currentThread().getName());

        MyThread myThread =new MyThread();
        myThread.setName("ExampleThread");
        myThread.start();

        Thread thread2= new Thread(new MyRunnable());
        thread2.start();

        Thread thread3= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("it is a thread that is created by anonymous with Runnable");
            }
        });
        thread3.start();
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("It is a thread that is create by anonymous class");
            }
        }).start();
    }
}
//extends Thread and override run method
class MyThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("It is custom thread");
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("It is custom thread that is implemented Runnable interface");

    }
}