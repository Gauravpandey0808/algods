//package locks;
//
//import java.util.concurrent.locks.ReadWriteLock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class ReadWriteLocks {
//    public static void main(String[] args) {
//        ReadWriteLock lock = new ReentrantLock();
//
//        DoSomeWork resource1 = new DoSomeWork();
//        DoSomeWork resource2 = new DoSomeWork();
//
//        Thread t1 = new Thread(() -> {
//            resource1.workWithLocks(lock);
//        });
//
//        Thread t2 = new Thread(() -> {
//            resource2.workWithLocks(lock);
//        });
//
//        t1.setName("thread1");
//        t2.setName("thread2");
//
//        t1.start();
//        t2.start();
//    }
//}
//
//
//class ReadWriteLockImpl {
//
//    public void workWithLocks(ReadWriteLock lock) {
//
//        try {
//            lock.writeLock().lock();
//            System.out.println("Lock acquired by " + Thread.currentThread().getName());
//            Thread.sleep(4000);
//
//        } catch (Exception e) {
//            System.out.println("There is some exception while using this " + e);
//        } finally {
//            lock.writeLock().unlock();
//            System.out.println("Lock has been released for : " + Thread.currentThread().getName());
//        }
//
//    }
//}
