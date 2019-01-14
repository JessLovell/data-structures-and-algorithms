package hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test public void testhashKey(){

        HashTable test = new HashTable();

        assertEquals("Expect to return a number",2, test.hashKey("jessica"));
        assertEquals("Expect to be a number less than size of table", 15, test.hashKey("Expect to be a number less than size of table"));
        assertEquals("Expect to be a number be consistent with same input", 15, test.hashKey("Expect to be a number less than size of table"));
        assertEquals("Expect to be a number less than size of table", 11, test.hashKey("12"));
    }

    @Test
    public void testAdd() {

        HashTable test = new HashTable();
        Node first = test.add("Key", "value");

        assertEquals("Node to be returned with value", "value",first.value);
        assertEquals("Node to be returned with Key", "Key",first.key);
        assertTrue("Node to be returned with value", test.buckets[1].contains(first));
    }


}