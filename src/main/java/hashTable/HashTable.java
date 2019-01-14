package hashTable;


import java.util.LinkedList;

public class HashTable<T> {

    public LinkedList[] table;

    public HashTable(){
        this.table = new LinkedList[16];
    }

    protected int hashKey(String key){

        //get char code sum
        int index = 0;
        for (char c : key.toCharArray()){
            index += (int) c;
        }

        //reduce to index in array length
        index *= 937;
        index = index % this.table.length;

        return index;
    }

    public Node<T> add(String key, T value){

        Node<T> nodeToAdd = new Node<>(key, value);

        //hash the key
        int index = hashKey(key);

        //add the node to table with index from hash
        this.table[index].add(nodeToAdd);

        return nodeToAdd;
    }
}
