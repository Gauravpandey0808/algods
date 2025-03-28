package threads;

public class EntendThreadClass extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(2000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("Here we are in the catch block");
            }

        }
    }
}




