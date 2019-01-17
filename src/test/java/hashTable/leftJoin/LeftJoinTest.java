package hashTable.leftJoin;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoin(){

        HashMap one = new HashMap();
        one.put("Lovell", "Jessica");
        one.put("Smith", "John");
        one.put("Johnson", "Tara");
        one.put("Mohamed", "Zahra");

        HashMap two = new HashMap();
        two.put("Lovell", "Britney");
        two.put("Smith", "Jane");
        two.put("Johnson", "Mike");

        HashMap<String, String[]> testOne = LeftJoin.leftJoin(one, two);
        assertEquals("Expect size 4", 4, testOne.size());
        assertTrue("Expect Lovell key", testOne.containsKey("Lovell"));
        assertTrue("Expect Smith key", testOne.containsKey("Smith"));
        assertTrue("Expect Johnson key", testOne.containsKey("Johnson"));
        assertTrue("Expect Mohamed key", testOne.containsKey("Mohamed"));
        assertEquals("Expect Tara", "Tara", testOne.get("Johnson")[0]);
        assertEquals("Expect Mike", "Mike", testOne.get("Johnson")[1]);
        assertEquals("Expect Jessica", "Jessica", testOne.get("Lovell")[0]);
        assertEquals("Expect Britney", "Britney", testOne.get("Lovell")[1]);
        assertEquals("Expect John", "John", testOne.get("Smith")[0]);
        assertEquals("Expect Jane", "Jane", testOne.get("Smith")[1]);
        assertEquals("Expect Zahra", "Zahra", testOne.get("Mohamed")[0]);
        assertEquals("Expect null", null, testOne.get("Mohamed")[1]);

        HashMap<String, String[]> testTwo = LeftJoin.leftJoin(two, one);
        assertEquals("Expect size 3", 3, testTwo.size());
        assertTrue("Expect Lovell key", testTwo.containsKey("Lovell"));
        assertTrue("Expect Smith key", testTwo.containsKey("Smith"));
        assertTrue("Expect Johnson key", testTwo.containsKey("Johnson"));
        assertFalse("Expect Mohamed to not be there", testTwo.containsKey("Mohamed"));
        assertEquals("Expect Britney", "Britney", testTwo.get("Lovell")[0]);
        assertEquals("Expect Jessica", "Jessica", testTwo.get("Lovell")[1]);
        assertEquals("Expect Jane", "Jane", testTwo.get("Smith")[0]);
        assertEquals("Expect John", "John", testTwo.get("Smith")[1]);
        assertEquals("Expect Mike", "Mike", testTwo.get("Johnson")[0]);
        assertEquals("Expect Tara", "Tara", testTwo.get("Johnson")[1]);
    }
}