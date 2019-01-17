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
//        assertEquals("kjsdhvjk", testOne.get("Lovell").toString());

        HashMap testTwo = LeftJoin.leftJoin(two, one);
        assertEquals("Expect size 3", 3, testTwo.size());
        assertTrue("Expect Lovell key", testTwo.containsKey("Lovell"));
        assertTrue("Expect Smith key", testTwo.containsKey("Smith"));
        assertTrue("Expect Johnson key", testTwo.containsKey("Johnson"));


    }

}