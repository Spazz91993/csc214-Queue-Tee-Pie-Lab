package org.example;
import java.util.ArrayList;
import java.util.List;

public class CuteQueue {
    private List<Cutie> queue;
    private int capacity;
    
    
    public CuteQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new ArrayList<>();
    }
    
    public void enqueue(Cutie cutie) {
        if (queue.size() >= capacity) {
            System.out.println("Queue is full! Cannot add more cuties.");
            return;
        }
        queue.add(cutie);
    }
    
    public Cutie dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty! Nothing to dequeue.");
            return null;
        }
        return queue.remove(0);
    }
    
    public int size() {
        return queue.size();
    }
}