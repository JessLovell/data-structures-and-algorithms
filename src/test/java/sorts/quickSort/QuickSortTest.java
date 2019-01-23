package sorts.quickSort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
    }

    @Test
    public void testListToArray() {
    }

    @Test
    public void testToList() {

        int[] one = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> oneTest = new ArrayList<>();
        assertTrue(QuickSort.toList(one) instanceof List);

    }
}