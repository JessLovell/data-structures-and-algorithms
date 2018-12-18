package stacksAndQueues;

public class Queue<T> {

    protected Node<T> front;
    protected Node<T> end;

    public Queue(){
        this.front = end;
        this.end = null;
    }

    //This method adds a node to the end of the queue
    public void enqueue(T value) {

        Node newNode = new Node(value, null);
        if (this.front == null ) {
            this.front = newNode;
            this.end = newNode;
        } else {
            this.end.next = newNode;
            this.end = this.end.next;
        }
    }

    //This method removes a node at the front of the queue
    public T dequeue(){

        if (this.front != null) {
            Node<T> temp = this.front;
            this.front= temp.next;
            return temp.data;
        } else {
          return null;
        }
    }

    //This method returns the value at the front of the queue
    public Node peek(){
        return this.front;
    }
}
