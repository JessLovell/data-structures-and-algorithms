# Trees
[Code](../src/main/java/tree) | [Tests](../src/test/java/tree)

## The Challenge
1. Create a Node class that has properties for the value stored in the node, the left child node, and the right child node .
2. Create a BinaryTree class.
    1. Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which takes in a root node, and returns an array of the nodes.
3. Create a BinarySearchTree class.
    1. Define a method named add that adds a new node in the correct location in the binary search tree.
    2. Define a method named search that brings in a value of node, and returns the node with the desired value.
4. Write **three** test assertions for each method.
5. **Stretch Goals:** Write a class for a `k-ary` tree. Use resources available to you online, implement a k-ary tree, where each node can have any number of children.

## Approach & Efficiency
My approach to solving this problem was to create an `.order()` method to direct which helper method would recurse the tree. In the recursion process, the node value would be added to a linked list and the linked list would be returned at the end.

Time | Space
---- | ----
O(n) | O(n)

## API
### BinaryTree Class
Method | Description
------ | -----------
`.order(String word)` | This public method takes in Strings `"in"`, `"pre"`, and `"post"` to determine how to order a list for a binary tree.
`.preorder()` | This private method is a helper method for `.order()` and takes in a root node to search a tree and return a list with the values order in pre-order fashion.
`.inorder()` | This private method is a helper method for `.order()` and takes in a root node to search a tree and return a list with the values order in an in-order fashion.
`.postorder()` | This private method is a helper method for `.order()` and takes in a root node to search a tree and return a list with the values order in post-order fashion.


### BinarySearchTree Class extends BinaryTree
Method | Description
---- | -----
`.add(T value)` | This method takes in a value and adds it to the correct leaf on a binary search tree. This returns `true` if a node is added.
`.search(T value, Node root)` | This method takes in a value and a root node to search the tree recursively for the node with the corresponding value. It then returns that node.