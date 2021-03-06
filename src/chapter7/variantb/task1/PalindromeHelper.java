package chapter7.variantb.task1;

import java.util.ArrayList;
import java.util.List;

public class PalindromeHelper {

    static void printLongestPalindrome(Text text) {
        List<String> words = new ArrayList<>();
        for (Paragraph paragraph : text.getParagraphList()) {
            for (Sentence sentence : paragraph.getSentenceList()) {
                for (SentenceElement sentenceElement : sentence.getSentenceElements()) {
                    if (sentenceElement.isWord()) {
                        words.add(sentenceElement.toString().toLowerCase());
                    }
                }
            }
        }
        String str = String.join("", words);
        int size = str.length();
        if (size < 2)
            return;
        int maxLength = 1, start = 0;
        int low, high;
        for (int i = 0; i < size; i++) {
            low = i - 1;
            high = i + 1;
            while (high < size && str.charAt(high) == str.charAt(i))
                high++;

            while (low >= 0 && str.charAt(low) == str.charAt(i))
                low--;

            while (low >= 0 && high < size && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }

            int length = high - low - 1;
            if (maxLength < length) {
                maxLength = length;
                start = low + 1;
            }
        }
        System.out.println(str.substring(start, start + maxLength));

    }

}
