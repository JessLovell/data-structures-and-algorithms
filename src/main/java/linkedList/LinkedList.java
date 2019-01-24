package linkedList;

public class LinkedList<T> {
    private Node<T> head;
    private int size;
    private Node<T> current;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    // this method will insert any value at the head of a linked list
    public void insert(T value) {

        //create a node & find the head pointer
        Node<T> newNode =  new Node (value, this.head);

        //set head to point at new node
        this.head = newNode;
        this.size++;
    }

    // this method checks to see if a value is in a linked list.
    public boolean includes(T value) {

        //find the head
        Node<T> current  = this.head;

        //check each node value in the list against input value
        while (current != null) {
            if (current.data.equals(value)) {
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
        Node<T> current = this.head;

        //output all values of the list
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // this method takes in a value and inserts it at the end of the list
    public void append(T value) {

        Node<T> current = this.head;

        while (current != null) {
            if (current.next == null) {
                Node<T> newNode = new Node(value, current.next);
                current.next = newNode;
                this.size++;
                return;
            } else {
                current = current.next;
            }
        }
    }

    //This method takes in a value to insert before a specific value in the list
    public void insertBefore(T targetValue, T newValue){
        Node<T> current = this.head;

        while (current != null){
            if ((current.next).data == targetValue){
                Node<T> newNode = new Node(newValue, current.next);
                current.next = newNode;
                this.size++;
                return;
            } else {
                current = current.next;
            }
        }
    }

    // this method takes in a value to insert after a specific value in the list
    public void insertAfter(T targetValue, T newValue) {
        Node<T> current = this.head;

        while (current != null){
            if (current.data == targetValue){
                Node<T> newNode = new Node(newValue, current.next);
                current.next = newNode;
                this.size++;
                return;
            } else {
                current = current.next;
            }
        }
    }

    // this method takes in a value to insert from the end - value position in the list
    public int kFromEnd(int k) {

        Node<T> current = this.head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        int deltaK = size - k;

        if (deltaK <= 0 || k < 0) {
            return -1;
        } else {
            current = this.head;
            for (int i = 0; i < deltaK; i++) {
                if (i == deltaK - 1) {
//                    return current.data;
                } else {
                    current = current.next;
                }
            }
        }
        return -1;
    }

    //This method takes in 2 linkedlists and zipper-merges them into linked list One
    public static LinkedList merge(LinkedList one, LinkedList two) {

        Node oneLeader = one.head.next;
        Node oneFollower = one.head;
        two.current = two.head;

        while (oneLeader != null) {

            if (two.current == null) {
                return one;
            }

            two.head = two.current.next;
            oneFollower.next = two.current;
            two.current.next = oneLeader;

            two.current = two.head;
            oneFollower = oneLeader;
            oneLeader = oneLeader.next;
        }

        oneFollower.next = two.current;
        return one;
    }

    public int size(){
        return this.size;
    }
}


