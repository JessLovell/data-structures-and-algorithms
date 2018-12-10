package StacksAndQueues;

public class Stack {

    protected Node top;

    public Stack(){
        this.top = null;
    }

    //define a method push adds a new node to the top of the stack
    public void push(Integer value){

        Node newNode = new Node(value, this.top);
        this.top = newNode;
    }

    //define a method pop removes the node from the top of the stack and returns it
    public Node pop(){

        Node temp = this.top;
        this.top = temp.next;
        return temp;
    }

    //this method peek returns the node located at the top of the stack
    public Node peek(){
        return this.top;
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
