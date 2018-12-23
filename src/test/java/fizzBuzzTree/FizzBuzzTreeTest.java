package fizzBuzzTree;

import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test public void testFizzBuzzTree() {
        Node rootOne = new Node(3,
                new Node(4,
                        new Node(105,
                                new Node(36, null, null),
                                new Node(75, null, null)),
                        new Node(88,
                                new Node(1, null, null),
                                new Node(7, null, null))),
                new Node(10,
                        new Node(13, null, null),
                        new Node(33,
                                new Node(8, null, null),
                                new Node(12, null, null))));

        BinaryTree treeOne = new BinaryTree();
        treeOne.root = rootOne;
        FizzBuzzTree.fizzBuzz(rootOne);
        ArrayList<Object> expectedList = new ArrayList<>(
                Arrays.asList("Fizz", "FizzBuzz", "FizzBuzz", 4, 1, 88, 7, "Fizz", 13, "Buzz", 8, "Fizz", "Fizz"));

        assertEquals(expectedList, treeOne.order("in"));
    }

    @Test public void testFizzBuzzTreeTwo() {
        Node rootOne = new Node(3, null, null);

        BinaryTree treeOne = new BinaryTree();
        treeOne.root = rootOne;
        FizzBuzzTree.fizzBuzz(rootOne);
        ArrayList<Object> expectedList = new ArrayList<>(
                Arrays.asList("Fizz"));

        assertEquals(expectedList, treeOne.order("in"));
    }

    @Test public void testFizzBuzzTreeThree() {
        Node rootOne = new Node(4, null, null);

        BinaryTree treeOne = new BinaryTree();
        treeOne.root = rootOne;
        FizzBuzzTree.fizzBuzz(rootOne);
        ArrayList<Object> expectedList = new ArrayList<>(
                Arrays.asList(4));

        assertEquals(expectedList, treeOne.order("in"));
    }
}