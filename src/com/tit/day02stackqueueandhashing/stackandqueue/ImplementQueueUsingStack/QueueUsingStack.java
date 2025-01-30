package com.tit.day02stackqueueandhashing.stackandqueue.ImplementQueueUsingStack;

public class QueueUsingStack {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enque("bhupendra");
        queue.enque("nikhil");
        queue.enque("gourav");

        System.out.println("Queue Size :"+queue.queueSize());

        System.out.println("Deque :"+queue.dequeue());
        System.out.println("Deque :"+queue.dequeue());

        System.out.println("Queue Size :"+queue.queueSize());

        System.out.println("Deque :"+queue.dequeue());

        System.out.println("Queue is Empty :"+queue.isEmpty());

        queue.enque("shubham");

        System.out.println("Deque :"+queue.dequeue());

    }


}
