package sorts.radixSort;

import java.util.LinkedList;

public class RadixSort {
    public static int[] radixSort(int[] input){

        int digitCount = String.valueOf(input[0]).length();
        int digitPlace = 1;

        LinkedList<Integer>[] toBeOrdered = instantiateLL(new LinkedList[10]);
        int index;

        for (int i = 0; i < digitCount; i++){
            for (int j = 0; j < input.length; j++){
                index = (input[j] / digitPlace) % 10;
                toBeOrdered[index].add(input[j]);
            }
            input = listToArray(toBeOrdered, input);
            toBeOrdered = instantiateLL(new LinkedList[10]);
            digitPlace *= 10;
        }
        return input;
    }

    protected static int[] listToArray(LinkedList[] toBeOrdered, int[] input){
        int inputIndex = 0;

        for (int k = 0;  k < toBeOrdered.length; k++){
            for (int l = 0; l < toBeOrdered[k].toArray().length; l++) {
                if(inputIndex < input.length) {
                    input[inputIndex] = (int) toBeOrdered[k].toArray()[l];
                    inputIndex++;
                }
            }
        }
        return input;
    }

    protected static LinkedList[] instantiateLL(LinkedList[] toBeOrdered){
        for (int i = 0; i < toBeOrdered.length; i++){
            toBeOrdered[i] = new LinkedList<>();
        }
        return toBeOrdered;
    }
}
