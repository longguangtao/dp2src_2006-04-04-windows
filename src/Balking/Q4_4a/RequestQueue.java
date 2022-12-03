package Balking.Q4_4a;

import java.util.Queue;

import GuardedSuspension.Sample.Request;

import java.util.LinkedList;

public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();
    public synchronized Request getRequest() {
        while (queue.peek() == null) {
            try {
                wait(30000);
                Thread.interrupted();
            } catch (InterruptedException e) {
            }   
        }
        return queue.remove();
    }
    public synchronized void putRequest(Request request) {
        queue.offer(request);
        notifyAll();
    }
}
