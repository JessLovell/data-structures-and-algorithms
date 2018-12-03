import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearch () {
        int[] first = {12, 16, 32, 45, 81, 91, 101, 131};
        int[] second = {1, 5, 7, 9, 11, 13};
        int[] third = {};

        assertEquals(6, BinarySearch.BinarySearch(first, 101));
        assertEquals(-1, BinarySearch.BinarySearch(second, 12));
        assertEquals(-1, BinarySearch.BinarySearch(third, 3));

        assertEquals(6, BinarySearch.OptimizedBS(first, 101));
        assertEquals(-1, BinarySearch.OptimizedBS(second, 12));
        assertEquals(-1, BinarySearch.OptimizedBS(third, 3));

    }
}