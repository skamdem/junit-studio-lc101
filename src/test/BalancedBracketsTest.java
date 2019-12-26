package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Good case
    @Test
    public void goodCase() {
        int[] test_array = {10, 11, 16, 48, 59};
        assertEquals(2, BonusBinarySearch.binarySearch(test_array, 16));
    }

    //Bad case
    @Test
    public void badCase() {
        int[] test_array = {10, 11, 16, 48, 59};
        assertEquals(-1, BonusBinarySearch.binarySearch(test_array, 12));
    }

}
