package LinkedList;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    // this method will insert any value at the head of a linked list
    public void insert(int value) {

        //create a node & find the head pointer
        Node newNode =  new Node (value, this.head);

        //set head to point at new node
        this.head = newNode;
    }

    // this method checks to see if a value is in a linked list.
    public boolean includes(int value) {

        //find the head
        Node current  = this.head;

        //check each node value in the list against input value
        while (current != null) {
            if (value == current.data) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    // this method will print the entire contents of the linked list
    public void print(){

        //find head
        Node current = this.head;

        //output all values of the list
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
