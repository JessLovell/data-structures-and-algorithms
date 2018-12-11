# Stacks & Queues
[Code](../src/main/java/StacksAndQueues) | [Tests](../src/test/java/StacksAndQueues)

## The Challenge
Create a Node class with two properties, data and a pointer. Create a Stack class that has the `top` property with methods `push`, `pop`, and `peek`. Create a Queue class that has a `top` property with methods `enqueue`, `dequeue`, and `peek`.

## Approach & Efficiency
My approach was to create three classes: `Node`, `Stack`, and `Queue` then to create corresponding methods for `Queue` and `Stack`. Methods in Stack and Class utilize O(1) space and time. 


## API
Class | Method | Description
---- | ---- | ----
Node | n/a | This class creates an instance of a node with properties for data and a pointer to the next node.
Stack | `.push(T data)` | This method adds data to the top of the stack.
Stack | `.pop()` | This method removes the data at the top of a stack and returns the data removed.
Stack | `.peek()` | This method returns the node at the top of a stack.
Queue | `.enqueue(T data)` | This method adds data to the end of a queue.
Queue | `.dequeue()` | This method removes the front node of a queue and returns the data removed
Queue | `.peek()` | This method returns the node at the front of a queue.

