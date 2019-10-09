package com.example.lab3triss;
import java.util.*;

public class TextManipulator {
    public String str;
    public Character[] delim = {'.', '?', '!'};

    TextManipulator(String str) {
        this.str = str.toLowerCase();
    }

    public void countSentences() {
        int sentenceCount = 0;
        List<Character> characters = Arrays.asList(delim);

        for (int i = 0; i < str.length() - 1; i++) {
            if(characters.contains(str.charAt(i)))
                if(!characters.contains((str.charAt(i + 1))))
                    sentenceCount++;
        }

        if(!characters.contains(str.charAt(str.length() - 2)))
            if(characters.contains(str.charAt(str.length() - 1)))
                sentenceCount++;

        System.out.println("Number of sentences: " + sentenceCount);
    }

    public void countLongestWord(){System.out.println("Longest word is: " + Arrays.stream(str.split(" ")).
            max(Comparator.
                    comparingInt(String::length)).
            orElse(null));}
    //arraystream is used to get a Sequential Stream from the array passed as the parameter with its elements.
    //split() method breaks a given string around matches of the given regular expression.
    //example of using :: --> Person::getName in this context is shorthand for (Person p) -> p.getName()
    //shortway of doing it using comparators

    public void PrintMostFrequent5Words() {
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

    public void countLetters() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count++;
        }
        System.out.println("Number of letters: " + count);
    }

    public void countVowsCons(){
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