package threads.thread01;
public class MultiThreading04 {
    public static void main(String[] args) {

        Brackets2 b1 = new Brackets2();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 1; i <= 7; i++) {
                    b1.generateBrackets();
                }
                long endTime = System.currentTimeMillis();

                System.out.println(endTime - startTime);
            }
        };

        t1.start();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                long startTime2 = System.currentTimeMillis();
                for (int i = 1; i <= 7; i++) {
                    b1.generateBrackets();
                }
                long endTime2 = System.currentTimeMillis();

                System.out.println(endTime2 - startTime2);
            };
        };

        t2.start();

    }

}

class Brackets2 {
    public void generateBrackets() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                if (i <= 5) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println("");

        }

        for(int i=1;i<=10;i++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



    }
}