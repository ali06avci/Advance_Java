package threads.thread01;

public class MultiThreading01 {
    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();

        CounterWithoutMultiThread obj1=new CounterWithoutMultiThread(1);
        obj1.countMe();

        System.out.println("---------------------------------------");

        CounterWithoutMultiThread obj2=new CounterWithoutMultiThread(2);
        obj2.countMe();


        long endTime=System.currentTimeMillis();
        System.out.println("WithoutMultiThread Time:"+(endTime-startTime));


        long startTime2=System.currentTimeMillis();

        CounterWithMultiThread obj3=new CounterWithMultiThread(1);
        obj3.start();

        System.out.println("---------------------------------------");

        CounterWithMultiThread obj4=new CounterWithMultiThread(2);
        obj4.start();





        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long endTime2=System.currentTimeMillis();

        System.out.println("WithMultiThread Time:"+(endTime2-startTime2));

    }



}


class CounterWithoutMultiThread{
    private int threadNum;

    public CounterWithoutMultiThread(int threadNum) {
        this.threadNum=threadNum;
    }

    public void countMe()  {
        for(int i=0;i<10;i++) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("i"+i+"Thread Number:"+threadNum);
        }
    }
}


class CounterWithMultiThread extends Thread{
    private int threadNum;

    public CounterWithMultiThread(int threadNum) {
        this.threadNum=threadNum;
    }

    public void countMe() {
        for(int i=0;i<10;i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("i"+i+"Thread Number:"+threadNum);
        }
    }

    @Override
    public void run() {
        countMe();
    }
}