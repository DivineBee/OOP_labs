package com.example.lab3triss;

public class Main {
    public static void main(String[] args) {
        TextManipulation str = new TextManipulation("Maybsdf sjfbsk bed . ufdsbf euru . euru euru bed sfbdf j bsfk sjhbfsey . fsef f e !");

        TextManipulation.countSentences();
        TextManipulation.countLength();
        TextManipulation.countFrequentWords();
        TextManipulation.countLetters();
        TextManipulation.countVowsCons();
    }
}