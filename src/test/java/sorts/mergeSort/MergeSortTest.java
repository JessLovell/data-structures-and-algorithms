package sorts.mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMerge() {

        int[] one = {1, 2, 7, 9};
        int[] two = {3, 4, 8};
        int[] oneTwo = {1,2,3,4,7,8,9};
        assertArrayEquals("Test regular array", oneTwo, MergeSort.merge(two, one));
        assertArrayEquals("Test regular array", oneTwo, MergeSort.merge(one, two));

        int[] three = {1, 3};
        int[] four = {2};
        int[] threeFour = {1,2,3};

        assertEquals(threeFour.length, MergeSort.merge(three, four).length);
        assertEquals(threeFour.length, MergeSort.merge(four, three).length);
        assertArrayEquals("Test regular array", threeFour, MergeSort.merge(three, four));
        assertArrayEquals("Test regular array", threeFour, MergeSort.merge(four, three));


        int[] five = {1, 3, 4, 7};
        int[] six = {4, 6, 8};
        int[] fiveSix = {1,3,4,4,6,7,8};
        assertArrayEquals("Test duplicate values", fiveSix, MergeSort.merge(five, six));
        assertArrayEquals("Test duplicate values", fiveSix, MergeSort.merge(six, five));

        int[] seven = {};
        int[] eight = {-1,2};
        int[] sevenEight = {-1,2};
        assertArrayEquals("Test negative and empty", sevenEight, MergeSort.merge(seven, eight));
        assertArrayEquals("Test negative and empty", sevenEight, MergeSort.merge(eight, seven));
    }

    @Test
    public void testMergeSort(){
        int[] one = {4, 6, 9, 2, 8, 3, 1};
        int[] oneSort = {1,2,3,4,6,8,9};
        assertArrayEquals("Test regular sorted array", oneSort, MergeSort.mergeSort(one));

        int[] two = {};
        assertArrayEquals("Test an empty array", new int[]{}, MergeSort.mergeSort(two));

        int[] three = {6, 4, 8, -10, 1, 6};
        assertArrayEquals("Test with negative numbers and duplicate values", new int[]{-10, 1, 4, 6, 6, 8}, MergeSort.mergeSort(three));

    }
}