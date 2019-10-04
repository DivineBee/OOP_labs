package com.example.lab3triss;

public class Main {
    public static void main(String[] args) {
        TextManipulation str = new TextManipulation("Maybsdf sjfbsk bed . ufdsbf euru . bed sfbdf j bsfk sjhbfsey . fsef f e !");
        //String str = "Maybsdf sjfbsk bed . ufdsbf euru. bed sfbdf j bsfk sjhbfsey. fsef f e!"; //our hardcoded string :)
        TextManipulation.countSentences();
        TextManipulation.countWords();
        TextManipulation.countLength();
        TextManipulation.countFrequentWords();
        TextManipulation.countLetters();
        TextManipulation.countVowsCons();
    }
}