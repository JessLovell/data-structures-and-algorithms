# Graphs
[Code](../src/main/java/graph) | [Tests*](../src/test/java/graph)
*NOTE: Tests methods should be run individually for them to pass. This is because sets do not always print in the same order and may fail because `assertEquals` is expecting exact quotes.

## The Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods: `addNode()`, `addEdge()`, `getNodes()`, `getNeighbors()`, `size()`.

## Approach & Efficiency
My approach for this challenge was to create classes: Node, Edge, and Graph and added the methods to the Graph class.

## API
### Node Class
The `Node` class has public properties `data` and `neighbors`.

Method | Description
------ | -------
`.addNeighbor(Node node)` | This method adds an edge from the current node to the input node.
`.addNeighbor(Node node, int weight)` | This method adds an edge from the current node to the input node and gives the edge weight.
`.toString` | This method returns information about the node in a String format.

### Edge Class
The `Edge` class has public properties `node` and `weight`.

Method | Description
------ | -------
`.toString()` | this method returns the information about an edge in a String format.

### Graph Class
The `Graph` class has a private property of `nodes`.

Method | Description
------ | -------
`.addNode(T data)` | This method creates a new node and adds it to the graph.
`.addEdge(Node one, Node two)` | This method adds an edge between two nodes and returns `true`.
`.addEdge(Node one, Node two, int weight)` | This method adds an edge and a weight between two nodes and returns `true.`
`.getNodes()` | This method returns a String output of the nodes in the graph.
`.getNeighbors(Node node)` | This method returns the String of neighbors of the input node.
`.size()` | This method returns the number of nodes in the graph.
