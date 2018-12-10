package StacksAndQueues;

public class Stack<T> {

    protected Node<T> top;

    public Stack(){
        this.top = null;
    }

    //define a method push adds a new node to the top of the stack
    public void push(T value){

        Node<T> newNode = new Node(value, this.top);
        this.top = newNode;
    }

    //define a method pop removes the node from the top of the stack and returns it
    public T pop() {

        if (this.top != null) {
            Node<T> temp = this.top;
            this.top = temp.next;
            return temp.data;
        } else {
            return null;
        }
    }

    //this method peek returns the node located at the top of the stack
    public Node<T> peek(){

        if (this.top == null) {
            return null;
        } else{
            return this.top;
        }
    }

    public void print() {
        Node current = this.top;

        //output all values of the list
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
