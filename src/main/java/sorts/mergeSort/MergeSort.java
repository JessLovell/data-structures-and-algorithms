package sorts.mergeSort;

public class MergeSort {

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
}
