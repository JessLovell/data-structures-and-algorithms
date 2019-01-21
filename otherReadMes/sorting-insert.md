## Insertion Sorting
[Code](../src/main/java/sorts/insertionSort) | [Test](../src/test/java/sorts/insertionSort)

## The Challenge
Write a function for insertion sort that takes in an unsorted array and returns the array sorted using insertion sort.

## Approach & Efficiency
My approach was to loop through the input array, create a temp variable to save the current value and compare it to the previous value in the array and switch the variables as necessary.

## APIs
Method | Description | Time | Space
--- | ---- | --- | ---
`.insertionSort(int[] array)` | This method sorts an array from min to max value using the insertion method | `O(n^2)` | `O(1)`
