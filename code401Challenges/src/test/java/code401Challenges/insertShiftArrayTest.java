package code401Challenges;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static code401Challenges.insertShiftArray.insertShiftArray;
public class insertShiftArrayTest {
    @Test
    public void ArrayShifted (){
        int[] test1 = {2,4,8,10};
        int[] test1Result = insertShiftArray(test1, 6);
        int[] test1Expect = {2,4,6,8,10};
        assertTrue("Did the Array shifted properly?", Arrays.equals(test1Result,test1Expect));
    }
    @Test
    public void arrayShiftLengthRight(){
        int[] test1 ={2,4,8,10};
        int[] test1Result = insertShiftArray(test1, 6);
        assertTrue("Did array Shift Length right?",(test1.length +1 == test1Result.length));
    }
}
