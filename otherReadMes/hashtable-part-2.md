# Repeated Word
## The Challenge
Given a long string return the first repeated word.

## Approach & Efficiency
My approach was to split the string by spaces and commas then put each word into an array. Loop through the array and check if the word is in the hashTable--if it is there, return the word.

Method | Description | Time | Space
---- | ---- | ---- | ----
`repeatedWord(String book)` | This method returns the first repeated word | `O(n)` | `O(n*n)`

## Solution
[Code](../src/main/java/hashTable/repeatedWord) | [Test](../src/test/java/hashTable/repeatedWord)

![White Board Image of Repeated Word](../assests/hashtable_repeated_word.JPG)