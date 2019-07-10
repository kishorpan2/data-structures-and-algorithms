package code401Challenges.hashTable;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class RepeatedWordTest {
    @Test
    public void testRepeatedWord(){
        assertEquals("","it",RepeatedWord.repeatedWord("it was an awesome day because it was not raining"));
        assertEquals("","is" ,RepeatedWord.repeatedWord("this is # a cat and  is a cow"));
        assertEquals("","this" ,RepeatedWord.repeatedWord("this this"));
    }

}