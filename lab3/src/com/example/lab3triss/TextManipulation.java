package com.example.lab3triss;
import java.util.*;
import java.util.Arrays;

public class TextManipulation {
    public static String str;
    TextManipulation(String str){
        this.str=str;
    }

    //-------------Sentence counter-------------//

    public static void countSentences() {
        int  sentenceCount=1; //setting counter
        String delim = ".,::?!"; //setting delimiters
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

    //---------Getting number of words------------------------//

    public static void countWords() {
        int words = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                words++;
            }
        }
        System.out.println("Number of words: " + words);
    }

    //-------------Getting the longest word---------------
    public static void countLength(){System.out.println("Longest word is: " + Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));}
    //arraystream is used to get a Sequential Stream from the array passed as the parameter with its elements.
    //split() method breaks a given string around matches of the given regular expression.
    //example of using :: --> Person::getName in this context is shorthand for (Person p) -> p.getName()
    //shortway of doing it using comparators

    //----------------Counting the most frequent word---------------//

    public static void countFrequentWords() {
        String[] words = str.split("\\.");    //Split the word from String
        int wrc = 1;                            //Variable for getting Repeated word count

        for (int i = 0; i < words.length; i++)        //Outer loop for Comparison
        {
            for (int j = i + 1; j < words.length; j++)    //Inner loop for Comparison
            {
                if (words[i].equals(words[j]))    //Checking for both strings are equal
                {
                    String bigwrd = words[i];
                    wrc = wrc + 1;                //if equal increment the count
                    words[j] = "0";            //Replace repeated words by zero
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + "--" + wrc);    //Printing the word along with count
            wrc = 1;
        }
    }
            //-----------Calculating nr of letters----------//

    public static void countLetters() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count++;
        }
        System.out.println("Number of letters: " + count);
    }
    //---------Calculating nr of vowels and consonants--------//

    public static void countVowsCons(){int vowsc=0;
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
