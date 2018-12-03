# Binary Search 
## Challenge
The challenge is to write a function that takes in a sorted array and an element to find in the array. If the element is not in the array, the function returns -1, otherwise the index position is returned. 

## Approach & Efficiency
My first solution was to loop through the whole array and check each element against the input key element. Once it matches, the index is returned; otherwise -1 is returned. At this rate, the Big O for time is linear O(n) and for space it is constant O(1).

The optimized search algorithm is to set the bounds for left and right indexes of the array. Then to compare the value at the middle of the array to the input value. If the input value is greater than the middle array value, then you reset the left bound to the middle bound. If he input value is less than the value in the middle of the array, then you reset the right bound to the middle. If the value is not in the array, exit the loop and return -1.

## Solution
[Code](../src/main/java/BinarySearch.java) | [Tests](../src/test/java/BinarySearchTest.java)

![White Board to Binary Search problem](../assets/array_binary_search.JPG)