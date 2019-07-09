package code401Challenges.hashTable;

import org.junit.Test;


import static org.junit.Assert.*;

public class HashTableTest {
    HashTable test = new HashTable<String>(800);

    @Test
    public void addKey(){
        test.add("code","challenge");
        String outPut = "challenge";
        assertEquals("",outPut,test.get("code"));
    }
    @Test
    public void testHash(){
        assertEquals("expect a number",480, test.hash("jim"));

    }
    @Test
    public void testDoesNotExist(){
        test.add("code","challenge");

        assertNull("",test.get("SN"));

    }


}