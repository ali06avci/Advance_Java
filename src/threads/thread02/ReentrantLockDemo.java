package threads.thread02;
import java.util.concurrent.locks.ReentrantLock;

/*
 * You can call lock and unlock methods from different methods.
 *
 * public void doSomething(){
 *   lock.lock();
 *
 *   try{
 *   }finally{
 *
 *   lock.unlock();
 *   }
 *
 *
 * }
 *
 */

/*public void somethingElse(){
	lock.lock();

	    try{
		    //dosomething();
	    }finally{

		    lock.unlock();
		    }


}*/

public class ReentrantLockDemo {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        MyRunnable myRunnable = new MyRunnable(lock);

        Thread thread1 = new Thread(myRunnable, "Passenger-1");
        thread1.start();

        Thread thread2 = new Thread(myRunnable, "Passenger-2");
        thread2.start();

        Thread thread3 = new Thread(myRunnable, "Passenger-3");
        thread3.start();

    }

}

class MyRunnable implements Runnable {

    int ticketsAvailable = 3;
    ReentrantLock lock;

    public MyRunnable(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " is waiting to book the ticket");

        lock.lock();

//		boolean isOk=false;
//
//		try {
//			isOk=lock.tryLock(5,TimeUnit.SECONDS);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//
//		if (isOk) {
        try {

            if (ticketsAvailable > 0) {
                System.out.println(Thread.currentThread().getName() + " is booking the ticket");
                Thread.sleep(3000);

                ticketsAvailable--;

                System.out.println(Thread.currentThread().getName() + " booked the ticket");
                System.out.println("The number of available ticket is " + ticketsAvailable);

            } else {
                System.out.println(Thread.currentThread().getName() + " could not book the ticket");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        finally {
            lock.unlock();
            // lock.unlock();
        }

    }

//		else {
//			System.out.println("It is blocked");
//		}
    // }

}