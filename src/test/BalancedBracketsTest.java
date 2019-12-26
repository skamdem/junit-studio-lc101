package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //"number of opening brackets" = "number of closing brackets" in the string
    @Test
    public void testNumberOfBracketsIsSameForEachType()
    {
        String str = "Launch[[Co[]de]]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(str));
    }

    //At any point within the string "number of opening brackets" >= "number of closing brackets" in the string
    @Test
    public void testOpeningBracketsNumberAlwaysSuperiorToClosingBracketsNumber ()
    {
        String str = "Launch]Code[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }


}
