package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    protected Node root;

    public BinaryTree(){
        this.root = null;
    }


    //This method determines if the list should be pre-ordered, in-order, or post-order.
    public List order(String order){

        List list = new ArrayList<>();
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
    private List preOrder(List list, Node node) {

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
    private List inOrder(List list, Node node) {

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
    private List postOrder(List list, Node node) {

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
