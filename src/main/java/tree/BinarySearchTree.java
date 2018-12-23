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
                    if (current.leftChild == null) {
                        current.leftChild = newNode;
                        return true;
                    } else {
                        current = current.leftChild;
                    }
                } else {
                    if (current.rightChild == null) {
                        current.rightChild = newNode;
                        return true;
                    } else {
                        current = current.rightChild;
                    }
                }
            }
        }
        return false;
    }

    //this method takes a value and returns the node with that value.
    public Node search() {

        return null;
    }
}
