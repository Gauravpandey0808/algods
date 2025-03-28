package threads;

public class MyCustomThread {

    public synchronized void taskOne() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("the number is :" + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }


    public static void main(String[] args) {

        MyCustomThread customThread = new MyCustomThread();
        Thread thread = new Thread(customThread::taskOne);
        thread.start();

    }
}
