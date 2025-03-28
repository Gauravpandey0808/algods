package multithread;

public class RunnableInterfaceImpl implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " " +i);
        }
        System.out.println("---------------------");
    }
}

class mainThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableInterfaceImpl());
        Thread t2 = new Thread(new RunnableInterfaceImpl());
        try {
            t1.setName("thread1");
            t2.setName("thread2");
            t1.start();
            t1.join();
            t2.start();
            t2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

}
