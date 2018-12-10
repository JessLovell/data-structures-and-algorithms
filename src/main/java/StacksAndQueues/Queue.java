package StacksAndQueues;

public class Queue<T> {

    protected Node<T> front = null;
    protected Node<T> end = null;

    public Queue(){
        this.front = front;
        this.end = end;
    }

    //This method adds a node to the end of the queue
    public void enqueue(T value) {

        //create a node
        //set it to back
        //reset end pointer

    }

    //This method removes a node at the front of the queue
    public T dequeue(){
        //get front
        //set front to new front
        //return the value
        return this.front.data;
    }

    //This method returns the value at the front of the queue
    public Node peek(){
        return this.front;
    }
}
