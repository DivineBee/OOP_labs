package com.example.lab3triss;
import java.util.*;

public class TextManipulation {
    public static String str;
    public static String delim = ".,::?!";

    TextManipulation(String str) {
        this.str = str.toLowerCase();
    }

    public static void countSentences() {
        int  sentenceCount = 1; //setting counter
        for (int i = 0; i < str.length() - 1; i++) { //a for loop using our vars str and delim
            for (int j = 0; j < delim.length(); j++) {
                if (str.charAt(i) == delim.charAt(j)) {
                    if (str.charAt(i + 1) == delim.charAt(j)) {
                        sentenceCount--;
                    }
                    sentenceCount++;
                }
            }
        }
        System.out.println("Number of sentences: "+ sentenceCount);;
    }

    public static void countLength(){System.out.println("Longest word is: " + Arrays.stream(str.split(" ")).
            max(Comparator.
                    comparingInt(String::length)).
            orElse(null));}
    //arraystream is used to get a Sequential Stream from the array passed as the parameter with its elements.
    //split() method breaks a given string around matches of the given regular expression.
    //example of using :: --> Person::getName in this context is shorthand for (Person p) -> p.getName()
    //shortway of doing it using comparators

    public static void countFrequentWords() {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        String[] words = str.split("\\P{L}+");  //split the words
        System.out.println("Number of words: " + words.length);

        for (int i = 0; i < words.length; i++) {
            if (frequencyMap.containsKey(words[i]))
                frequencyMap.put(words[i], frequencyMap.get(words[i]) + 1);
            else
                frequencyMap.put(words[i], 1);
        }

        List<Map.Entry<String, Integer>> results = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(results, new ValueComparator());
        System.out.println("Top 5 words : " + results.subList(0, 5));
    }

    public static void countLetters() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count++;
        }
        System.out.println("Number of letters: " + count);
    }

    public static void countVowsCons(){
        int vowsc=0;
        int consc=0;
        str = str.toLowerCase();//this is used in order to reduce comparisions
        for(int i = 0; i < str.length(); i++) {//Checks whether a character is a vowel
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowsc++;//Increments the vowel counter
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {//else its a consonant
                consc++;//Increments the consonant counter
            }
        }
        System.out.println("Number of vowels: " + vowsc);
        System.out.println("Number of consonants: " + consc);
    }
}

class ValueComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> first, Map.Entry<String, Integer> second) {
        if(first.getValue() > second.getValue())
            return -1;
        else if (first.getValue() < second.getValue())
            return 1;
        return 0;
    }
}