package sorts.quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static int[] quickSort(int[] input){
        if (input.length < 2) {
            return input;
        } else {
            int pivot = input[0];
            List<Integer> smaller = new ArrayList<>();
            List<Integer> larger = new ArrayList<>();
            for (int i = 1; i < input.length; i++){
                if(input[i] < pivot){
                    smaller.add(input[i]);
                } else {
                    larger.add(input[i]);
                }
            }

            //sort the arrays.
            List<Integer> sorted = new ArrayList<>();
            sorted.addAll(toList(quickSort(listToArray(smaller))));
            sorted.add(pivot);
            sorted.addAll(toList(quickSort(listToArray(larger))));

            return listToArray(sorted);
        }
    }

    //Convert a List<Integer> to an int[]
    public static int[] listToArray(List<Integer> list){

        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++){
            array[i] = list.get(i);
        }
        return array;
    }

    //convert an int[] to a List<Integers>
    public static List<Integer> toList(int[] array){

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            result.add(array[i]);
        }
        return result;
    }
}
