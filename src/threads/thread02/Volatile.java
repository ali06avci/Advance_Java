package threads.thread02;
public class Volatile {

    public static int flag=0;

    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {

            @Override
            public void run() {
                while(true) {
                    if(flag==0) {
                        System.out.println("Thread 1 running");
                    }else {
                        break;
                    }
                }

            }
        });

        t1.start();


        Thread t2=new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                flag=1;

                System.out.println("The value of flag is updated");
            }
        });

        t2.start();
    }

}