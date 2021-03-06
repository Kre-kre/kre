package chapter4.varianta.task1;

import java.util.ArrayList;
import java.util.List;


public class TextImpl implements Text {
    private String header;
    private final List<Sentence> sentenceList = new ArrayList<>();

    @Override
    public void printText() {
        for (Sentence sentence : sentenceList) {
            System.out.print(sentence.toString().trim().concat(" "));
        }
    }


    @Override
    public void printHeader() {
        System.out.println(header);
    }

    @Override
    public void addSentence(Sentence sentence) {
        sentenceList.add(sentence);

    }


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }


}

