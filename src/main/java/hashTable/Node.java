package hashTable;

public class Node<T> {

    public String key;
    public T value;

    public Node(String key, T value){
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return this.key + ": " + this.value;
    }
}


