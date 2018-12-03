# Linked List
## The Challenge
Create a Node class that contains data and a pointer to the next Node. Create a Linked List class, an empty linked list
should be created upon instantiation.

## Approach & Efficiency
My approach for this project was to create a Node class and a LinkedList Class and then create methods .insert,
.includes, .print.
Method | Time | Space
---- | ---- | ----
.insert(int value) | O(1) | O(1)
.includes(int value) | O(log (n)) | O(1)
.print(int value) | O(log(n)) | O(n)


## API
Method | Description
------ | -----
.insert(int value) | Takes in an integer value as an argument and adds a new node with that value to the head of the
list.
.includes(int value) | Takes in an integer value as an argument and returns a boolean result depending on the value
exists
as a
Node's value somewhere within the list.
.print() | Does not accept arguments and will output all the current Node Values in the linked list.
