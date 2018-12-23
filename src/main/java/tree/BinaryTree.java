package tree;

import stacksAndQueues.Queue;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    public Node<T> root;

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
    private List preOrder(List<T> list, Node<T> node) {

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
    private List inOrder(List<T> list, Node<T> node) {

        if (node.leftChild != null){
            inOrder(list, node.leftChild);
        }
        list.add(node.data);

        if (node.rightChild != null){
            inOrder(list, node.rightChild);
        }
        return list;
    }

    //This method will order the tree post-order by left, right, root.
    private List postOrder(List<T> list, Node<T> node) {

        if (node.leftChild != null){
            postOrder(list, node.leftChild);
        }
        if (node.rightChild != null){
            postOrder(list, node.rightChild);
        }

        list.add(node.data);
        return list;
    }

    //this method will print out the tree in a breadth first approach
    public void breadthFirst() {
        if (this.root != null){
            Queue<Node> q = new Queue();
            q.enqueue(this.root);

            while (q.peek() != null){

                Node front = q.dequeue();
                System.out.print(front.data + " ");

                if (front.leftChild != null){
                    q.enqueue(front.leftChild);
                }
                if (front.rightChild != null){
                    q.enqueue(front.rightChild);
                }
            }
        } else {
            System.out.println("Root is bad");
        }
    }

    public static int findMax(Node n){

        if (n == null){
            return 0;
        }

        int max = (int) n.data;
        int leftMax = findMax(n.leftChild);
        int rightMax = findMax(n.rightChild);

        if (leftMax > max){
            max = leftMax;
        }
        if (rightMax > max){
            max = rightMax;
        }
        return max;
    }
}