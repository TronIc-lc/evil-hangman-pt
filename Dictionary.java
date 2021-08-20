import java.util.*;
import java.util.Scanner;

public class MyClass {
    public ArrayList<String> wordList = new ArrayList;
    
    public Dictionary() {
        // "Documentation?? Are you crazy?! We're not Microsoft!"
        // Constructs a Dictionary based on the words located in the file given as an argument. 
        // Note: Make sure "dictionary.txt" is in the project folder
        File myFile = new File("dictionary.txt");
        Scanner in = null;
        try {
            in = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(in.hasNextLine()) {
            String wordInLine = in.nextLine();
            wordList.add(wordInLine);
            System.out.println(line);
            
        }
    }
    
    public boolean hasWordsOfLength(int len) {
        // Returns true if the Dictionary has words of the given length; false otherwise. 
        int index = 0; 
        int elementLength = wordList[0].length();
        for(int i=1; i< wordList.length(); i++) {
            if(wordList[i].length() > elementLength) {
                index = i; elementLength = wordList[i].length();
            }
        }

        if ((wordList[index].length() <= len) && (wordList[index].length() > 0)) 
            { return true; }
        else { return false; }
    }
    
    public ArrayList<String> getWordsOfLength(int len) {
        // Returns an ArrayList of words of the given length.
        int index = 0; 
        public ArrayList<String> truncatedWordList
        for(int i=0; i < wordList.length(); i++) {
            if(wordList[i].length() == len) {
                truncatedWordList.add(wordList[i]);
            }
        }
        return truncateWordList;
    }
    
    public static void main(String[] args) {
        Dictionary();
        System.out.println(hasWordsOfLength(5));
        System.out.println("Words: " + getWordsOfLength);
    }
}
