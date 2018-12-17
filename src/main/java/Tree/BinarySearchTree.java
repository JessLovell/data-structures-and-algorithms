package Tree;

public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree() {
        super();
    }

    //this method adds a value to the tree
    public boolean add(int value){

        Node newNode = new Node(value, null, null);
        if (this.root == null){
            this.root = newNode;
            return true;
        } else {
            Node current = this.root;

            while (current != null) {

                if (current.data == value) {
                    return false;
                } else if (current.data > value) {
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
