public class BinarySearch {
    public static void main (String args) {
        int[] first = {12, 16, 32, 45, 81, 91, 101, 131};
        int[] second = {1, 5, 7, 9, 11, 13};
        int[] third = {};

        System.out.println(BinarySearch(first, 101));
        System.out.println(BinarySearch(second, 12));
        System.out.println(BinarySearch(third, 3));
        System.out.println(OptimizedBS(third, 3));
    }

    public static int BinarySearch (int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int OptimizedBS(int[] arr, int value) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int middle = (left + right) / 2;
            if (arr[middle] < value){
                
            } else if (arr[middle] > value){

            } else {
                return middle;
            }
        }
        return -1;
    }
}
