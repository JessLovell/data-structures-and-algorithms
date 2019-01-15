package hashTable.repeatedWord;

import java.util.HashSet;

public class RepeatedWord {

    //This method finds the first repeated word in a string and returns that word.
    public static String repeatedWord(String book){

        //Split the string by the spaces
        String[] words = book.toLowerCase().split("\\s+");
        HashSet wordsInABook = new HashSet();

        for (int i = 0; i < words.length; i++){
            if (!wordsInABook.contains(words[i])){
                wordsInABook.add(words[i]);
            } else {
                return words[i];
            }
        }
        return "No repeated words";
    }
}
