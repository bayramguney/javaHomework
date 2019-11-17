package day21;

public class homework {
    public static void main(String[] args) {

        wordCountMethod();
    }

    private static void wordCountMethod() {
        String sentence = "The quick brown fox jumps over the lazy dog.";

        String[] word = sentence.split(" ");
        System.out.println("Number of words in the string:   " + word.length);

    }


}



