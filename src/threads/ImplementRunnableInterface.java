package threads;

public class ImplementRunnableInterface implements Runnable{

    public void run() {
        for(int i=0 ; i < 100 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Here we are in the catch block");
            }
        }

    }
}
