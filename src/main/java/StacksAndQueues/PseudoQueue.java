package StacksAndQueues;

public class PseudoQueue<T> {

    protected Stack<T> enQ;
    protected Stack<T> deQ;

    public PseudoQueue() {
        this.enQ = new Stack<>();
        this.deQ = new Stack<>();
    }

    //This method adds a node to the queue
    public void enqueue(T data) {

        if (this.enQ.peek() == null && this.deQ.peek() == null){
            this.enQ.push(data);
        } else if (this.deQ.peek() == null){
            this.enQ.push(data);
        } else {
            while(this.deQ.peek() != null){
                this.enQ.push(this.deQ.pop());
            }
            this.enQ.push(data);
        }
    }

    //This method removes a the first node from a queue
    public T dequeque() {

        if (this.enQ.peek() == null && this.deQ.peek() == null){
            return null;
        } else if (this.enQ.peek() == null){
            return this.deQ.pop();
        } else {
            while(this.enQ.peek() != null){
                this.deQ.push(this.enQ.pop());
            }
            return this.deQ.pop();
        }
    }
}
