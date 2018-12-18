package fizzBuzzTree;

import tree.Node;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTree {

    public static void FizzBuzzTree (Node n){

        fizzBuzzHelper(n);
    }

    public static void fizzBuzzHelper(Node n) {

        System.out.println(isFizzBuzz(n));

        if (n.leftChild != null) {
            fizzBuzzHelper(n);
        }
        if (n.rightChild != null) {
            fizzBuzzHelper(n);
        }
    }

    public static Node<T> isFizzBuzz(Node<T> n){

        if (n.data % 3 == 0 && n.data % 5 == 0) {

        } else if ((int)n % 3 == 0) {
            return "Fizz";
        } else if ((int)n % 5 == 0) {
            return "Buzz";
        } else {
            return n;
        }
    }
}
