package code401Challenges.hashTable;

import java.util.HashSet;

public class RepeatedWord {
    public static String  repeatedWord(String essay) {
        //split the string at spaces
        String[] sentence = essay.toLowerCase().split("\\s+");
        HashSet wordsInEssay = new HashSet();

        for(int i=0;i < sentence.length;i++){
            if (!wordsInEssay.contains(sentence[i])){
                wordsInEssay.add(sentence[i]);
            }
            else{
                return sentence[i];
            }
        }
    return "No repeat";
    }
}