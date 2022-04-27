package threads.thread01;

public class MultiThreading03 {
    public static void main(String[] args) {

        Brackets b1=new Brackets();
        Brackets b2=new Brackets();


        Thread t1=new Thread() {
            @Override
            public void run() {
                for(int i=1;i<=7;i++) {
                    b1.generateBrackets();
                }
            }
        };


        t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


        Thread t2=new Thread() {
            @Override
            public void run() {
                for(int i=1;i<=7;i++) {
                    b2.generateBrackets();
                }
            };
        };

        t2.start();


    }


}


class Brackets{
    synchronized public void generateBrackets(){
        for(int i=1;i<=10;i++) {
            if(i<=5) {
                System.out.print("[");
            }else {
                System.out.print("]");
            }
        }
        System.out.println("");
    }
}