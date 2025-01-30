package com.tit.day02stackqueueandhashing.stackandqueue.ImplementQueueUsingStack;

import java.util.Stack;

public class Queue {


    private Stack<String> stack1;
    private Stack<String> stack2;

    Queue(){
        stack1 = new Stack<>();
        stack2 = new Stack< >();
    }

    public void enque(String data){
        stack1.push(data);
    }

    public String dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
        } else if (stack2.isEmpty()) {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }
        else {
           return false;
        }
    }

    public int queueSize(){
        int size = stack1.size()+stack2.size();
        return size;
    }



}
