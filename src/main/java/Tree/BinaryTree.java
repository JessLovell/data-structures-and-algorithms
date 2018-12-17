package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    protected Node<T> root;

    public BinaryTree(){
        this.root = null;
    }


    //This method determines if the list should be pre-ordered, in-order, or post-order.
    public List<T> order(String order){

        List<T> list = new ArrayList<>();
        if (order.toLowerCase().equals("pre")){
            list = preOrder(list, this.root);
        } else if (order.toLowerCase().equals("in")){
            list = inOrder(list, this.root);
        } else if (order.toLowerCase().equals("post")) {
            list = postOrder(list, this.root);
        } else {
            return null;
        }
        return list;
    }
     //This method pre-orders the tree by root, left, right.
    private List<T> preOrder(List<T> list, Node<T> node) {

        list.add(node.data);

        if (node.leftChild != null){
            preOrder(list, node.leftChild);
        }
        if (node.rightChild != null){
            preOrder(list, node.rightChild);
        }
         return list;
    }

    //This method will order the tree in-order of left, root, right.
    private List<T> inOrder(List<T> list, Node<T> node) {

        if (node.leftChild != null){
            inOrder(list, node.leftChild);
        }
        list.add(node.data);

        if (node.rightChild != null){
            inOrder(list, node.rightChild);
        }
        return list;
    }

    //This method will orfer the tree post-order by left, right, root.
    private List<T> postOrder(List<T> list, Node<T> node) {

        if (node.leftChild != null){
            postOrder(list, node.leftChild);
        }
        if (node.rightChild != null){
            postOrder(list, node.rightChild);
        }

        list.add(node.data);
        return list;
    }
}
