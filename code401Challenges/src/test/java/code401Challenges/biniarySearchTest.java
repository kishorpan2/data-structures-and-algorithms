package code401Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class biniarySearchTest {
    @Test
    public void testBiniarySearch (){
        int [] one = {45, 38, 35, 28, 15};
        int [] two = {102, 109, 115};
        int [] three = {};

        assertEquals(0, BiniarySearch.biniarySearch(two,102));
//        assertEquals(0, BiniarySearch.biniarySearch(three,1));
        assertEquals(-1, BiniarySearch.biniarySearch(two,15));
    }

}