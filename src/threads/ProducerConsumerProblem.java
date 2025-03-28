package threads;

public class ProducerConsumerProblem {


    public static void main(String[] args) {

        ConsumerProducerImpl impl = new ConsumerProducerImpl(10);
        Thread t1 = new Thread(() -> {
            try {
                impl.consume();
            } catch (Exception e) {
                System.out.println("There is some error in consuming" + e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                for (int i = 1; i < 10; i++) {
                    impl.produce(i);
                }
            } catch (Exception e) {
                System.out.println("There is some error in consuming" + e);
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                for (int i = 1; i < 15; i++) {
                    impl.consume();
                }
            } catch (Exception e) {
                System.out.println("There is some error in consuming" + e);
            }
        });

        Thread t4 = new Thread(() -> {
            try {
                    impl.produce(20);
            } catch (Exception e) {
                System.out.println("There is some error in consuming" + e);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
