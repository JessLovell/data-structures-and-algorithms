package StacksAndQueues;

public class Queue<T> {

    protected Node<T> front;
    protected Node<T> end;

    public Queue(){
        this.front = end;
        this.end = null;
    }

    //This method adds a node to the end of the queue
    public void enqueue(T value) {

        Node newNode = new Node(value, this.end);
        if (this.front == end) {
            this.end = newNode;
            System.out.println(this.end.data);
        } else {

        }
    }

    //This method removes a node at the front of the queue
    public T dequeue(){

        Node<T> temp = this.front;
        this.front = temp.next;
        return temp.data;
    }

    //This method returns the value at the front of the queue
    public Node peek(){
        return this.front;
    }

    //this method outputs the queue to the CLI
    public void print() {
        Node current = this.front;

        //output all values of the list
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
