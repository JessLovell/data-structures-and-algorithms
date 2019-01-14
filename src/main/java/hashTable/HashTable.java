package hashTable;


import java.util.LinkedList;

public class HashTable<T> {

    public LinkedList<Node<T>>[] buckets;

    public HashTable(){
        this.buckets = new LinkedList[16];
    }

    //This method will turn the key into an index value
    protected int hashKey(String key){

        //get char code sum
        int index = 0;
        for (char c : key.toCharArray()){
            index += (int) c;
        }

        //reduce to index in array length
        index *= 937;
        index = index % this.buckets.length;

        return index;
    }

    //This method adds a node to the hashtable
    public Node<T> add(String key, T value){

        Node<T> nodeToAdd = new Node<>(key, value);

        //hash the key
        int index = hashKey(key);

        //add the node to table with index from hash
        if (this.buckets[index] == null){
            this.buckets[index] = new LinkedList<>();
            this.buckets[index].add(nodeToAdd);
        }

        return nodeToAdd;
    }
}
