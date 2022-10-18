package exp8;

class PrintSequenceRunnable implements Runnable{

    public int upperlimit=9;
    static int  lowerlimit=1;
    int remainder;
    static Object lock=new Object();

    PrintSequenceRunnable(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (lowerlimit < upperlimit-1) {
            synchronized (lock) {
                while (lowerlimit % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + lowerlimit);
                lowerlimit++;
                lock.notifyAll();
            }
        }
    }
}


public class threading1 {

    public static void main(String[] args) {

        PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
        PrintSequenceRunnable runnable2=new PrintSequenceRunnable(2);
        PrintSequenceRunnable runnable3=new PrintSequenceRunnable(0);

        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");

        t1.start();
        t2.start();
        t3.start();
    }
}

