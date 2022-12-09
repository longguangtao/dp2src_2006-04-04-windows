package Future.Q9_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FutureData implements Data {
    private RealData realdata = null;
    private boolean ready = false;
    public synchronized void setRealData(RealData realdata) {
        if (ready) {
            return;     // balk
        }
        this.realdata = realdata;
        this.ready = true;
        notifyAll();
    }
    public synchronized String getContent() {
        
        while (!ready) {
            try {
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                int activeCount = threadGroup.activeCount();
                Thread[] threads = new Thread[activeCount];
                threadGroup.enumerate(threads);
                List<Thread> threadList = Arrays.asList(threads);
        
                List<Thread> futureThread = threadList.stream().filter(thread -> 
                    "Future".equals(thread.getName())
                ).collect(Collectors.toList());

                // Thread thread = futureThread.get(0);

                if (futureThread == null || futureThread.size() == 0) {
                    Thread.currentThread().interrupt();
                }

                wait();
            } catch (InterruptedException e) {
                return "";
            }
        }
        return realdata.getContent();
    }
}
