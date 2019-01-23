package sorts.quickSort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
    }

    @Test
    public void testListToArray() {

        List<Integer> one = new ArrayList<Integer>();
        one.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertTrue("Expect to be an array", QuickSort.listToArray(one) instanceof int[]);
        assertEquals("Expect to have same size", one.size(), QuickSort.listToArray(one).length);
        for (int i = 0; i < one.size(); i++){
            assertEquals("Expect " + i + " to be the same", (int)one.get(i), QuickSort.listToArray(one)[i]);
        }

        List<Integer> two = new ArrayList<>();
        two.addAll(Arrays.asList(new Integer[]{-1, -2, 5, 7, 8, -19}));
        assertTrue("Expect to be an array", QuickSort.listToArray(two) instanceof int[]);
        assertEquals("Expect to have same size", two.size(), QuickSort.listToArray(two).length);
        for (int i = 0; i < two.size(); i++){
            assertEquals("Expect " + i + " to be the same", (int)two.get(i), QuickSort.listToArray(two)[i]);
        }

        List<Integer> three = new ArrayList<>();
        assertTrue("Expect to be an array", QuickSort.listToArray(three) instanceof int[]);
        assertEquals("Expect to have same size", three.size(), QuickSort.listToArray(three).length);
    }
    

    @Test
    public void testToList() {

        int[] one = {1, 2, 3, 4, 5, 6, 7, 8};
        assertTrue("Expect to be a list", QuickSort.toList(one) instanceof List);
        assertEquals("Size should be the same", one.length, QuickSort.toList(one).size());
        for (int i = 0; i < one.length; i++){
            assertEquals("Expect " + i + " to be the same", one[i], (int)QuickSort.toList(one).get(i));
        }

        int[] two = {-1, -2, 5, 7, 8, -19};
        assertTrue("Expect to be a list", QuickSort.toList(two) instanceof List);
        assertEquals("Size should be the same", two.length, QuickSort.toList(two).size());
        for (int i = 0; i < two.length; i++){
            assertEquals("Expect " + i + " to be the same", two[i], (int)QuickSort.toList(two).get(i));
        }

        int[] three = {};
        assertTrue("Expect to be a list", QuickSort.toList(three) instanceof List);
        assertEquals("Size should be the same", three.length, QuickSort.toList(three).size());
    }
}