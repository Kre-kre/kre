package chapter7.variantb.task1;

public class Runner {
    public static void main(String[] args) {
        Text text = new Text("The \"standard\" error output stream? This stream is already open and ready to accept output data.\n" +
                "Typically this stream corresponds to display output or another output destination specified by the host " +
                "environment or user. By convention, this output stream is used to display error messages or other " +
                "information that should come to the immediate attention of a user even if the principal output stream," +
                " the value of the variable out, has been redirected to a file or other destination that is typically " +
                "not continuously monitored.");

        System.out.println(text);
        System.out.println(text.getRepeatedWord());
        System.out.println(text.getSortedQuantityWordsSentences());
        System.out.println(text.getCountSentenceWithRepeatedWords());
        System.out.println(text.getUniqueWord());
        text.swapFirstAndLastSentenceWords();
        System.out.println(text.getUniqueWordsInterrogateSentences(5));
        text.removeVowelStartingWords(5);
        text.printSortedFirstLetterWord();
        System.out.println(text.getSortedPercentageVowelsLetters());
        System.out.println(text.getSortedSecondConsonantLetter());
        PalindromeHelper.printLongestPalindrome(text);
    }

}

