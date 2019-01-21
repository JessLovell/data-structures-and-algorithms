package sorts.insertionSort;

public class InsertionSort  {

    public static int[] insertionSort(int[] input){

        for (int i = 1; i < input.length; i++){
            int j = i - 1;
            int temp = input[i];

            while (j >= 0 && temp < input[j]){
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = temp;
        }

        return input;
    }
}
