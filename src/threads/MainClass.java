package threads;

public class MainClass {

    public static void main(String args[]) {
//        EntendThreadClass ex = new EntendThreadClass();
//
//        Thread thread = new Thread(ex);
//
//        thread.start();
//
//        thread.setName("Gaurav");
//
//        System.out.println("The name of the thread is " + thread.getName() );

        ImplementRunnableInterface impl = new ImplementRunnableInterface();
        impl.run();
    }
}
