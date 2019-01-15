package hashTable.repeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void testRepeatedWord(){
        assertEquals("a", RepeatedWord.repeatedWord("Once upon a time, there was a brave princess who"));
    }

}