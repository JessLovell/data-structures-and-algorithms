package hashTable.repeatedWord;

import hashTable.HashTable;

public class RepeatedWord {

    //This method finds the first repeated word in a string and returns that word.
    public static String repeatedWord(String book){

        //Split the string by the spaces
        String[] words = book.split("\\s+");
        HashTable wordsInABook = new HashTable();
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i] + " " + wordsInABook.contains(words[i]));
            if (wordsInABook.contains(words[i]) == false){
                wordsInABook.add(words[i], 1);
            } else {
                return words[i];
            }
            System.out.println(words[i] + " " + wordsInABook.contains(words[i]));
        }
        return "No repeated words";
    }
}
