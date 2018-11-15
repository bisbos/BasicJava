package basicJava.stringstudy;

import java.util.Comparator;

public class MaxOccuranceComparable implements Comparable<MaxOccuranceComparable> {

    int occurence;
    String word;

    @Override
    public int compareTo(MaxOccuranceComparable obj){
        return obj.occurence - this.occurence;
    }

    public int getOccurence() {
        return occurence;
    }

    public void setOccurence(int occurence) {
        this.occurence = occurence;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
