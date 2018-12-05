# Linked List
[Code](../src/main/java/LinkedList) | [Tests](../src/test/java/LinkedList/LinkedListTest.java)

## The Challenge
Create a Node class that contains data and a pointer to the next Node. Create a Linked List class, an empty linked list
should be created upon instantiation.

## Approach & Efficiency
My approach for this project was to create a Node class and a LinkedList Class and then create methods .insert, .includes, .print.

Method | Time | Space
---- | ---- | ----
`.append(int value)` | O(n) | O(1)
`.includes(int value)` | O(log (n)) | O(1)
`.insert(int value)` | O(1) | O(1)
`.insertAfter(int targetValue, int newValue)` | O(n) | O(1)
`.insertBefore(int targetValue, int newValue)` | O(n) | O(1)
`.kFromEnd(int value)` | O(n) | O(1)
`.print(int value)` | O(log(n)) | O(n)


## API
Method | Description
------ | -----
`.append(int value)` | Takes in an integer value and adds a new node with that value to the end of the list
`.includes(int value)` | Takes in an integer value as an argument and returns a boolean result depending on the value exists as a Node's value somewhere within the list.
`.insert(int value)` | Takes in an integer value as an argument and adds a new node with that value to the head of the list.
`.insertAfter(int targetValue, int newValue)` | Takes in target value currently in the list and adds a new value after the target value.
`.insertBefore(int targetValue, int newValue)` | Takes in target value currently in the list and adds a new value before the target value.
`.kFromEnd(int value)` | Takes in a value and returns the nth value from the end of the list. If it is not in the list, returns -1.
`.print()` | Does not accept arguments and will output all the current Node Values in the linked list.

