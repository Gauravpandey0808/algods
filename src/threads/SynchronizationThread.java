package threads;

public class SynchronizationThread {


    public static void main(String[] args) {

        SynchronizationThread thread = new SynchronizationThread();

        Thread thread1 = new Thread(thread::methodThread);

        Thread thread2 = new Thread(thread::methodThread);

        Thread thread3 = new Thread(thread::methodThread);


        thread1.setName("methodThreadOne");
        thread2.setName("methodThreadTwo");
        thread3.setName("methodThreadThree");

        thread1.start();
        thread2.start();
        thread3.start();

//        -------------------------------------------------------------------------------------------

        Thread thread4 = new Thread(thread::blockSynchronization);

        Thread thread5 = new Thread(thread::blockSynchronization);

        Thread thread6 = new Thread(thread::blockSynchronization);

        thread4.setName("blockSynchronizationOne");
        thread5.setName("blockSynchronizationTwo");
        thread6.setName("blockSynchronizationThree");

        thread4.start();
        thread5.start();
        thread6.start();

    }

    public synchronized void methodThread() {

        try {
            Thread.sleep(1000);
            System.out.println("Here is the current thread : " + Thread.currentThread().getName());

        } catch (Exception e) {
            System.out.println("Here is the error" + e);

        }
    }

    public void blockSynchronization() {

        System.out.println("Here is the current thread : " + Thread.currentThread().getName());
        synchronized (this) {
            try {
                Thread.sleep(1000);
                System.out.println("Here is the current thread inside the synchronized block: " + Thread.currentThread().getName());


            } catch (Exception e) {
                System.out.println("Here is the error" + e);

            }

        }
    }
}
