package hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test public void testGetHash(){

        HashTable test = new HashTable();

        assertEquals("Expect to return a number",2, test.getHash("jessica"));
        assertEquals("Expect to be a number less than size of table", 15, test.getHash("Expect to be a number less than size of table"));
        assertEquals("Expect to be a number be consistent with same input", 15, test.getHash("Expect to be a number less than size of table"));
        assertEquals("Expect to be a number less than size of table", 11, test.getHash("12"));
    }

    @Test
    public void testAdd() {

        HashTable test = new HashTable();
        Node first = test.add("Key", "value");

        assertEquals("Node to be returned with value", "value",first.value);
        assertEquals("Node to be returned with Key", "Key",first.key);
        assertTrue("Node to be returned with value", test.buckets[1].contains(first));
    }

    @Test
    public void testFind() {
        HashTable test = new HashTable();
        Node first = test.add("Jessica", "Lovell");
        Node second = test.add("Lovell", 12);

        assertEquals("Expect to have 12 returned for Lovell", 12, test.find("Lovell"));
        assertEquals("Expect null for Amber", null, test.find("Amber"));
    }

    @Test
    public void testContains(){
        HashTable test = new HashTable();
        Node first = test.add("Jessica", "Lovell");
        Node second = test.add("Lovell", 12);

        assertTrue("Expect True for 'Jessica'", test.contains("Jessica"));
        assertTrue("Expect True for 'Lovell'", test.contains("Lovell"));
        assertFalse("Expect True for sdf", test.contains("sdf"));


    }
}