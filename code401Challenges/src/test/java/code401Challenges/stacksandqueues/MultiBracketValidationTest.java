package code401Challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void testMultiBracketValidation(){
        MultiBracketValidation multi = new MultiBracketValidation();

        assertTrue("This should return true",multi.multiBracketValidation("{}"));
        assertTrue("This should return true",multi.multiBracketValidation("{}()"));
        assertTrue("This should return true",multi.multiBracketValidation("(hell{[]idk})"));
        assertFalse("This should return false",multi.multiBracketValidation("{)}"));
        assertFalse("This should return false",multi.multiBracketValidation("{[}()("));
        assertFalse("This should return false",multi.multiBracketValidation("(hell{[]idk}{}})"));

    }

}