package threads.thread01;

public class MultiThreading02 {

    public static void main(String[] args) {

        Printer obj=new Printer();

        Thread t1=new Thread() {
            public void run() {
                obj.printData(5);
            };
        };


        Thread t2=new Thread() {
            public void run() {
                obj.printData(100);
            };
        };

        t1.start();

//
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


        t2.start();


    }
}


class Printer{
    synchronized public void printData(int n) {
        for(int i=1;i<=5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}