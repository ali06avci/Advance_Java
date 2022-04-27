package threads.thread02;
public class WaitNotify {

    public double balance=0;

    public static void main(String[] args) throws InterruptedException {

        WaitNotify obj=new WaitNotify();

        Thread thread1=new Thread(new Runnable() {

            @Override
            public void run() {
                obj.withdraw(800);
            }
        });

        thread1.setName("Withdraw Thread");
        thread1.start();


        Thread thread2=new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                obj.deposit(5000);

            }
        });

        thread2.setName("Deposit thread");
        thread2.start();



        Thread.sleep(40000);



    }

    public void withdraw(double amount) {
        synchronized (this) {
            if(balance<=0||balance<amount) {
                try {
                    System.out.println("Waiting for the balance to be updated");
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }
        balance=balance-amount;
        System.out.println("Withdrawal is successfully done. \n The Current balance is "+balance);
    }

    public void deposit(double amount) {
        balance=balance+amount;
        System.out.println("The Balance is updated");

        synchronized (this) {
            notify();
            //notifyAll();
        }
    }

}