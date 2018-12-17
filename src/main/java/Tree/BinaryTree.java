package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    protected Node<T> root;

    public BinaryTree(){
        this.root = null;
    }


    // This method will pre-order the binary tree by root, left, then right.
    public List<T> preOrder(){

        List<T> list = new ArrayList<>();
        preOrderHelper(list, this.root);
        return list;
    }
     //This method fills in the list.
    public List<T> preOrderHelper(List<T> list, Node<T> node) {

        list.add(node.data);

        if (node.leftChild != null){
            preOrderHelper(list, node.leftChild);
        }
        if (node.rightChild != null){
            preOrderHelper(list, node.rightChild);
        }
         return list;
    }



    public T[] inOrder() {
        return null;
    }

    public T[] postOrder() {
        return null;
    }
}
