package sorts.radixSort;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void testRadixSort() {

        int[] one = {3, 7, 1, 3, 6, 9};
        assertArrayEquals("One: Expect to be sorted", new int[]{1, 3, 3, 6, 7, 9}, RadixSort.radixSort(one));

        int[] two = {675, 345, 372, 127, 900};
        assertArrayEquals("Two: Expect to be sorted", new int[]{127, 345, 372, 675, 900}, RadixSort.radixSort(two));

        int[] three = {102456, 968576, 573890, 273654, 869403, 960595};
        assertArrayEquals("Three: Expect to be sorted", new int[]{102456, 273654, 573890, 869403,960595, 968576}, RadixSort.radixSort(three));

        int[] four = {1222, 5222, 7222, 1022, 3222, 6222, 9222};
        assertArrayEquals("Four: Expect to be sorted", new int[]{1022, 1222, 3222, 5222, 6222, 7222, 9222}, RadixSort.radixSort(four));
    }

    @Test
    public void testListToArray(){

        LinkedList[] oneList = new LinkedList[2];
        for (int i = 0; i < oneList.length; i++){
            oneList[i] = new LinkedList<>();
        }
        oneList[0].add(203);
        oneList[1].add(405);
        oneList[0].add(302);
        int[] oneArr = {405, 302, 203};

        assertArrayEquals("Expect to be same arr", new int[]{203, 302, 405}, RadixSort.listToArray(oneList, oneArr) );

        LinkedList[] twoList = new LinkedList[4];
        for (int i = 0; i < twoList.length; i++){
            twoList[i] = new LinkedList<>();
        }
        twoList[0].add(230);
        twoList[1].add(450);
        twoList[0].add(320);
        twoList[3].add(567);
        int[] twoArr = {230, 450, 320, 567};
        assertArrayEquals("Expect to be same arr", new int[]{230, 320, 450, 567}, RadixSort.listToArray(twoList, twoArr) );


        LinkedList[] threeList = new LinkedList[10];
        for (int i = 0; i < threeList.length; i++){
            threeList[i] = new LinkedList<>();
        }
        threeList[8].add(203);
        threeList[1].add(405);
        threeList[9].add(302);
        threeList[7].add(302);
        threeList[7].add(345);
        threeList[7].add(346);
        threeList[2].add(967);


        int[] threeArr = {203, 302, 405, 302, 967, 346, 345};

        assertArrayEquals("Expect to be same arr", new int[]{405, 967, 302, 345, 346, 203, 302}, RadixSort.listToArray(threeList, threeArr) );
    }

    @Test
    public void testInstantiateLL(){

        LinkedList[] oneList = new LinkedList[2];
        assertEquals("One: Expect to be null", null, oneList[0]);
        assertEquals("One: Expect to be null", null, oneList[1]);
        assertTrue("One: Expect to be empty", RadixSort.instantiateLL(oneList)[0].isEmpty());
        assertTrue("One: Expect to be empty", RadixSort.instantiateLL(oneList)[1].isEmpty());

        LinkedList[] twoList = new LinkedList[17];
        for (int i = 0; i < twoList.length; i++){
            assertEquals("Two: Expect to be null", null, twoList[i]);
        }
        twoList = RadixSort.instantiateLL(twoList);
        for (int i = 0; i < twoList.length; i++){
            assertTrue("Two: Expect to be empty", twoList[i].isEmpty());
        }

        LinkedList[] threeList = new LinkedList[1];
        assertEquals("One: Expect to be null", null, threeList[0]);
        assertTrue("One: Expect to be empty", RadixSort.instantiateLL(threeList)[0].isEmpty());
    }
}