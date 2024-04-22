import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordsFactory wordsMethod = new WordsFactory();

        KeepWordsLength vowelsMethod = wordsMethod.wordMethodCreate(EWordsType.VOWELS);
        KeepWordsLength consonantsMethod = wordsMethod.wordMethodCreate(EWordsType.CONSONANTS);

        System.out.println(consonantsMethod.removeWordsEndingWith("hi hi dd", 2));
        System.out.println(vowelsMethod.removeWordsEndingWith("hi hi dd", 2));
    }

}