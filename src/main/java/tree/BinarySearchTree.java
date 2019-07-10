package tree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree {

    public BinarySearchTree() {
        super();
    }

    //this method adds a value to the tree
    public boolean add(T value){

        Node<T> newNode = new Node(value, null, null);
        if (this.root == null){
            this.root = newNode;
            return true;
        } else {
            Node<T> current = this.root;

            while (current != null) {

                if (current.data.equals(value)) {
                    return false;
                } else if (current.data.compareTo(value) > 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        return true;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        return true;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
        return false;
    }

    //this method takes a value and returns the node with that value.
    public Node<T> search(T value, Node<T> node) {


        if (value == node.data){
            return node;
        }

        if (value.compareTo(node.data) < 0) {
            return search(value, node.left);
        }
        else {
            return search(value, node.right);
        }
    }
}
