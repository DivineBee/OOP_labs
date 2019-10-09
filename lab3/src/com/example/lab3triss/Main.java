package com.example.lab3triss;

public class Main {
    public static void main(String[] args) {

        TextManipulator textManipulator = new TextManipulator("Maybsdf sjfbsk bed . ufdsbf euru . euru euru bed sfbdf j bsfk sjhbfsey . fsef f e !");

        textManipulator.countSentences();
        textManipulator.countLongestWord();
        textManipulator.PrintMostFrequent5Words();
        textManipulator.countLetters();
        textManipulator.countVowsCons();
    }
}