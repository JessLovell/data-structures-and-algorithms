# Trees

## The Challenge
1. Write a function called FizzBuzzTree which takes a tree as an argument.
2. Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
    - If the value is divisible by 3, replace the value with “Fizz”
    - If the value is divisible by 5, replace the value with “Buzz”
    - If the value is divisible by 3 and 5, replace the value with “FizzBuzz”

## Approach & Efficiency
My approach was to traverse the tree recursively, and change each node according to the challenge rules.

Memory | Time
--- | ----
`O(n)` | `O(n)`

## Solution
[Code](../src/main/java/fizzBuzzTree/FizzBuzzTree.java) | [Tests](../src/test/java/fizzBuzzTree/FizzBuzzTreeTest.java)


![Whiteboard of the fizz buzz tree](../assets/tree_fizz_buzz.JPG)
