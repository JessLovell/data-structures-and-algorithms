import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {

        //testing insertShiftArray
        int[] array = {1,2,3,5};
        int[] array2 = {2,4,6,8,10};
        int[] array3 = new int[0];

        System.out.println("shifting an array: ");
        System.out.println(Arrays.toString(array3) + " ==> " + Arrays.toString(insertShiftArray(array3, 7)));
        System.out.println(Arrays.toString(array) + " ==> " + Arrays.toString(insertShiftArray(array, 6)));
        System.out.println(Arrays.toString(array2) + " ==> " + Arrays.toString(insertShiftArray(array2, 7)));

        System.out.println("removing an element: ");
        System.out.println(Arrays.toString(array) + " ==> " + Arrays.toString(removeMiddle(array)));
        System.out.println(Arrays.toString(array2) + " ==> " + Arrays.toString(removeMiddle(array2)));
    }

    public static int[] insertShiftArray (int[] arr, int element) {

        int[] newArr = new int[arr.length + 1];
        int middle;

        //determine the midpoint of the array
        if (arr.length % 2 == 0){
            middle = arr.length / 2;
        } else if (arr.length == 0){
            newArr[0] = element;
            return newArr;
        } else {
            middle = (arr.length +1) / 2;
        }

        //create a new array with the element inserted as the midpoint in the old array
        for (int i = 0; i < newArr.length; i++) {
            if (i < middle){
                newArr[i] = arr[i];
            } else if (i == middle) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static int[] removeMiddle (int[] arr) {

        int[] newArr = new int[arr.length - 1];
        int middle = arr.length / 2;

        for (int i = 0 ; i < newArr.length ; i++){
            if (i < middle) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }
}
