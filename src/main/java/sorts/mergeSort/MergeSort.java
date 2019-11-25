package sorts.mergeSort;

public class MergeSort {

    // This method merges two sorted arrays
    public static int[] merge(int[] one, int[] two){

        int[] combined = new int[one.length + two.length];
        int j = 0; //counter for array one
        int k = 0; //counter for array two
        for (int i = 0; i < combined.length; i++){
            if(j < one.length && k < two.length) {
                if (one[j] < two[k]) {
                    combined[i] = one[j];
                    j++;
                } else {
                    combined[i] = two[k];
                    k++;
                }
            } else {
                if(j < one.length){
                    combined[i] = one[j];
                    j++;
                } else if (k < two.length){
                    combined[i] = two[k];
                    k++;
                }
            }
        }
        return combined;
    }

    // This method mergeSorts an array
    public static int[] mergeSort(int[] input){
        if (input.length < 2){
            return input;
        } else{

            //split the input array
            int[] first = new int[input.length/2];
            int[] second = new int[input.length - first.length];
            for (int i = 0; i < input.length; i++){
                if (i < input.length/2){
                    first[i] = input[i];
                } else {
                    second[i - (input.length/2)] = input[i];
                }
            }
            
            return merge(mergeSort(first), mergeSort(second));
        }
    }

    public static int[] mergeAgain(int[] arr, int start, int end){

        if (start - end < 0){
            return arr;
        }

        //get mid

        return arr;
    }
}
