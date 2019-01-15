# Hash Tables
[Code](../src/main/java/hashTable) | [Test](../src/test/java/hashTable)

## The Challenge
Implement a Hashtable with the following capabilities `add`, `find`, `contains`, `getHash`.

## Approach & Efficiency
My approach was to create a `HashTable` class and a `Node` class.

## API
### Node Class
The `Node` class has properties `key` and `value`.

### HashTable Class
The `HashTable` class has an array of `buckets`.

Method | Description | Time | Space
---- | --- | --- | ---
`.getHash(String key)` | This method takes a String and converts it into an `int`. | `O(n)` | `O(n)`
`.add(String key, T value)` | This method adds a `key`-`value` to the `HashTable`. | `O(1)` | `O(n*n)`
`.find(String key)` | This method returns the `value` with a given `key`. | `O(k)` | `O(1)`
`.contains(String key)` | This method returns `true` if a `key` is in the `HashTable`. | `O(k)` | `O(1)`

*`O(k)` where *k* is the number of key collisions.
