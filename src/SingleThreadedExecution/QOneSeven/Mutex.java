package SingleThreadedExecution.QOneSeven;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mutex extends ReentrantLock{
    private static Lock lock = new Lock() {

        @Override
        public void lock() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void lockInterruptibly() throws InterruptedException {
            // TODO Auto-generated method stub
            
        }

        @Override
        public boolean tryLock() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void unlock() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public Condition newCondition() {
            // TODO Auto-generated method stub
            return null;
        }
        
    };

    // public synchronized static void lock() {
    //     lock.lock();
    // }

    // public synchronized static void unlock() {
    //     lock.unlock();
    
}
