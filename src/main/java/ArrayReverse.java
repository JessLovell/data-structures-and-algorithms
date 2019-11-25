import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("The original array was: " + Arrays.toString(array));
        reverseArray(array);
        reverseArrayStretch(array);
    }

    public static void reverseArray(int[] arr) {
        int arrayLength = arr.length;
        int[] newArray = new int[arrayLength];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arrayLength-1-i];
        }

        System.out.println("The reversed array is: " + Arrays.toString(newArray));
    }

    public static void reverseArrayStretch(int[] arr){
        for (int i = 0; i < arr.length/2; i++){
            int placeholder = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = placeholder;
        }

        System.out.println("The stretch array is: " + Arrays.toString(arr));
    }
}
