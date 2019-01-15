package hashTable;


import java.util.LinkedList;

public class HashTable<T> {

    public LinkedList<Node<T>>[] buckets;

    public HashTable(){
        this.buckets = new LinkedList[16];
    }

    //This method will turn the key into an index value
    public int getHash(String key){

        //get char code sum
        long index = 0;
        for (char c : key.toCharArray()){
            index += (int) c;
        }

        //reduce to index in array length
        index *= 937;
        index = index % this.buckets.length;

        return (int) index;
    }

    //This method adds a node to the hashtable
    public Node<T> add(String key, T value){

        //hash the key
        int index = getHash(key);

        //add the node to table with index from hash
        Node<T> nodeToAdd = new Node<>(key, value);

        if (this.buckets[index] == null){
            this.buckets[index] = new LinkedList<>();
        }
        this.buckets[index].add(nodeToAdd);

        return nodeToAdd;
    }

    //This method returns the value of a key
    public T find(String key){

        int index = getHash(key);
        if (this.buckets[index] != null) {
            for (Node n : this.buckets[index]){
                if (this.buckets[index].peek().key == key) {
                    return this.buckets[index].peek().value;
                }
            }
        }
        return null;
    }

    public boolean contains(String key){

        int index = getHash(key);
        if (this.buckets[index] != null) {
            for (Node n : this.buckets[index]){
                if (this.buckets[index].peek().key == key) {
                    return true;
                }
            }
        }
        return false;
    }
}
