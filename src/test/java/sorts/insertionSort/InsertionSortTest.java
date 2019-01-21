package sorts.insertionSort;

import org.junit.Test;
import sorts.sorting.insertionSort.InsertionSort;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort() {

        int[] one = new int[]{4,3,1,8,5,7,2,6};
        for (int i = 1; i <one.length + 1; i++){

            assertEquals("input should be " +  i, i, InsertionSort.insertionSort(one)[i - 1]);
        }

        int[] two = new int[]{12,11,10,9,8,7,6,5,4,3,2,1};
        for (int i = 1; i <two.length + 1; i++){

            assertEquals("input should be " +  i, i, InsertionSort.insertionSort(two)[i - 1]);
        }

        int[] three = new int[]{1, 2, 3, 4, 8, 4, 5, 6 ,7 };
        int[] threeSorted = new int[]{1, 2, 3, 4, 4, 5, 6 ,7, 8};

        for (int i = 0; i < three.length; i++){

            assertEquals("input should be " +  threeSorted[i], threeSorted[i], InsertionSort.insertionSort(three)[i]);
        }
    }
}