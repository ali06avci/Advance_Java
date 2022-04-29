package threads.thread01;
public class MultiThreading05 {
    public static void main(String[] args) {

        Brackets3 b1 = new Brackets3();
        Brackets3 b2= new Brackets3();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 7; i++) {
                    b1.generateBrackets();
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {

                for (int i = 1; i <= 7; i++) {
                    b2.generateBrackets();
                }
            };
        };
        t2.start();
    }
}
class Brackets3 {
    synchronized public static void generateBrackets() {
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                System.out.print("[");
            } else {
                System.out.print("]");
            }
        }
        System.out.println("");
    }
}