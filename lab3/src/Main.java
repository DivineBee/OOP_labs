import java.util.*;
import java.util.StringTokenizer; //for using tokens for counting words
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int  sentenceCount=1; //setting counter
        String str = "Maybsdf sjfbsk bed . ufdsbf euru. bed sfbdf j bsfk sjhbfsey. fsef f e!"; //our hardcoded string :)
        //-------------Sentence counter-------------//
        String delim = ".,::?!"; //setting delimiters
        for(int i=0;i<str.length()-1;i++){ //a for loop using our vars str and delim
            for(int j=0;j<delim.length();j++){
                if(str.charAt(i)==delim.charAt(j)){
                    if(str.charAt(i+1)==delim.charAt(j)){
                        sentenceCount--;}
                    sentenceCount++;  } } }
        System.out.println("Number of sentences "+sentenceCount);
        //---------getting number of words using tokens-----------//
        //String tokenizer is used to separate a string into tokens(chunks of words for ex
        //using a specific delimiter)
        //StringTokenizer token = new StringTokenizer(str);
        //System.out.println("Number of words "+token.countTokens());
        //---------Getting number of words------------------------//
        int words = 1;
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            { words++; }
        }
        System.out.println("Number of words" + words);
        //-------------Getting the longest word---------------
        System.out.println("Longest word "+Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
        //shortway of doing it using comparators
        //----------------Counting the most frequent word---------------//
        String[] m = str.split(" ");
        int k[] = new int[]{-1, 0};
        for (int i = 0; i < m.length; i++) {
            if (!m[k[1]].equals(m[i]) || k[0] < 0) {
                int c = 1;
                for (int p = i + 1; p < m.length; p++) {
                    if (m[i].equals(m[p])) {
                        c++; }
                }
                if (k[0] < c) {
                    k[0] = c;
                    k[1] = i;
                }
            }
        }
        System.out.println("Most frequent word is: "+m[k[1]]+" it is repeated "+k[0]+" times");
        //-----------Calculating nr of letters----------//
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count++; }
        System.out.println("Number of letters "+count);
        //---------Calculating nr of vowels and consonants--------//
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