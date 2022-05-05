package threads.thread02;
import java.util.concurrent.CountDownLatch;

public class Latch {

    public static void main(String[] args) {

        CountDownLatch latch=new CountDownLatch(4);

        WorkerThread first=new WorkerThread(10000, latch, "worker-1");
        WorkerThread second=new WorkerThread(20000, latch, "worker-2");
        WorkerThread third=new WorkerThread(30000, latch, "worker-3");
        WorkerThread fourth=new WorkerThread(50000, latch, "worker-4");


        first.start();
        second.start();
        third.start();
        fourth.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println(Thread.currentThread().getName() +" has finished");
    }


}

class WorkerThread extends Thread{
    private int delay;
    private CountDownLatch latch;

    public WorkerThread(int delay, CountDownLatch latch, String name) {
        super(name);
        this.delay=delay;
        this.latch=latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            latch.countDown();
            System.out.println(Thread.currentThread().getName()+" finished");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
