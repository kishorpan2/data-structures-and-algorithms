package code401Challenges.hashTable;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {
    @Test
    public void testLeftJoin(){
        HashMap one = new HashMap();
        one.put("kis","pande");
        one.put("kiss","pan");
        one.put("kisss","pnde");
        one.put("kissss","pae");

        HashMap two = new HashMap();
        two.put("kis","Sarvin");
        two.put("kiss","Srvin");
        two.put("kisss","Savin");
        two.put("kissss","Sarvn");

        HashMap<String,String[]> test = LeftJoin.leftJoin(one,two);
        assertEquals("",4 , test.size());
        assertTrue("",test.containsKey("kisss"));
        assertEquals("","pande",test.get("kis")[0]);

    }

}