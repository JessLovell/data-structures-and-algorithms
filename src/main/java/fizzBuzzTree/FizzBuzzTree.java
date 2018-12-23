package fizzBuzzTree;

import tree.BinaryTree;
import tree.Node;

public class FizzBuzzTree extends BinaryTree {

    public static void fizzBuzz (Node<Object> n) {

        if (n == null){
            return;
        }
        if ((Integer) n.data % 15 == 0){
           n.data = "FizzBuzz";
        }
        else if ((Integer) n.data % 5 == 0){
            n.data = "Buzz";
        }
        else if ((Integer) n.data % 3 == 0){
            n.data = "Fizz";
        }
         if (n.leftChild != null){
             fizzBuzz(n.leftChild);
         }
         if (n.rightChild != null){
             fizzBuzz(n.rightChild);
         }
    }
}
