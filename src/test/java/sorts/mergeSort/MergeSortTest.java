package sorts.mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void merge() {

        int[] one = new int[]{1, 2, 7, 9};
        int[] two = new int[]{3, 4, 8};
        int[] oneTwo = new int[]{1,2,3,4,7,8,9};

        assertEquals(oneTwo.length, MergeSort.merge(one, two).length);
        assertEquals(oneTwo.length, MergeSort.merge(two, one).length);
        assertArrayEquals(oneTwo, MergeSort.merge(two, one));
        assertArrayEquals(oneTwo, MergeSort.merge(one, two));

        int[] three = new int[]{1, 3};
        int[] four = new int[]{2};
        int[] threeFour = new int[]{1,2,3};

        assertEquals(threeFour.length, MergeSort.merge(three, four).length);
        assertEquals(threeFour.length, MergeSort.merge(four, three).length);
        assertArrayEquals(threeFour, MergeSort.merge(three, four));
        assertArrayEquals(threeFour, MergeSort.merge(four, three));


        int[] five = new int[]{1, 3, 4, 7};
        int[] six = new int[]{4, 6, 8};
        int[] fiveSix = new int[]{1,3,4,4,6,7,8};
        assertArrayEquals(fiveSix, MergeSort.merge(five, six));
        assertArrayEquals(fiveSix, MergeSort.merge(six, five));

        int[] seven = new int[]{};
        int[] eight = new int[]{-1,2};
        int[] sevenEight = new int[]{-1,2};
        assertArrayEquals(sevenEight, MergeSort.merge(seven, eight));
        assertArrayEquals(sevenEight, MergeSort.merge(eight, seven));

    }
}