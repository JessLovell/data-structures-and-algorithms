package hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test public void testhashKey(){

        HashTable test = new HashTable();

        assertEquals("Expect to return a number",2, test.hashKey("jessica"));
        assertEquals("Expect to be a number less than size of table", 15, test.hashKey("Expect to be a number less than size of table"));
        assertEquals("Expect to be a number less than size of table", 11, test.hashKey("12"));
    }

    @Test
    public void add() {
    }


}