package LinkedList;

import java.util.ArrayList;

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
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // this method takes in a value and inserts it at the end of the list
    public void append(int value) {

        Node current = this.head;

        while (current != null) {
            if (current.next == null) {
                Node newNode = new Node(value, current.next);
                current.next = newNode;
                break;
            } else {
                current = current.next;
            }
        }
    }

    //This method takes in a value to insert before a specific value in the list
    public void insertBefore(int targetValue, int newValue){
        Node current = this.head;

        while (current != null){
            if ((current.next).data == targetValue){
                Node newNode = new Node(newValue, current.next);
                current.next = newNode;
                break;
            } else {
                current = current.next;
            }
        }
    }

    // this method takes in a value to insert after a specific value in the list
    public void insertAfter(int targetValue, int newValue) {
        Node current = this.head;

        while (current != null){
            if (current.data == targetValue){
                Node newNode = new Node(newValue, current.next);
                current.next = newNode;
                break;
            } else {
                current = current.next;
            }
        }
    }
}
