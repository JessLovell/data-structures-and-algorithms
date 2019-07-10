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
    private List<T> preOrder(List<T> list, Node<T> node) {

        list.add(node.data);

        if (node.left != null){
            preOrder(list, node.left);
        }
        if (node.right != null){
            preOrder(list, node.right);
        }
         return list;
    }

    //This method will order the tree in-order of left, root, right.
    private List inOrder(List<T> list, Node<T> node) {

        if (node.left != null){
            inOrder(list, node.left);
        }
        list.add(node.data);

        if (node.right != null){
            inOrder(list, node.right);
        }
        return list;
    }

    //This method will order the tree post-order by left, right, root.
    private List postOrder(List<T> list, Node<T> node) {

        if (node.left != null){
            postOrder(list, node.left);
        }
        if (node.right != null){
            postOrder(list, node.right);
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

                if (front.left != null){
                    q.enqueue(front.left);
                }
                if (front.right != null){
                    q.enqueue(front.right);
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
        int leftMax = findMax(n.left);
        int rightMax = findMax(n.right);

        if (leftMax > max){
            max = leftMax;
        }
        if (rightMax > max){
            max = rightMax;
        }
        return max;
    }


    public static int getWidth(Node root){

        if (root == null){
            return 0;
        }
        int sum = 1;

        if (root.left != null || root.right != null) {
            Node rightN = root.right;
            Node leftN = root.left;

            while (rightN != null || leftN != null) {
                if (rightN != null){
                    rightN = rightN.right;
                    sum++;
                }
                if (leftN != null){
                    leftN = leftN.left;
                    sum++;
                }
                }
            }
        return sum;
    }

    public static void printVertical(Node root){

          // instantiate a new Queue and initalize each index
          Queue[] q = new Queue[getWidth(root) + 1];
          for(int i = 0; i < q.length; i++){
               q[i] = new Queue<>();
          }

          // The root of the tree should be printed in the center of the array
           int idx = getWidth(root)/2 + 1;

          // fill the queue
          addtoQueue(q, idx, root);

          // print the queue
          for (int i = 0; i < q.length; i++){
              while(!q[i].isEmpty()){
                  System.out.print(q[i].dequeue() + " ");
              }
              System.out.println();
          }
    }

    public static Queue[] addtoQueue(Queue[] q, int idx, Node root){

        if(root == null || idx >= q.length || idx < 0){
            return q;
        }

        q[idx].enqueue(root.data);
        addtoQueue(q, idx + 1, root.right);
        addtoQueue(q, idx - 1, root.left);

        return q;
    }


}
