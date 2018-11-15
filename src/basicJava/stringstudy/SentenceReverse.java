package basicJava.stringstudy;

public class SentenceReverse {

    public static void main(String[] args){
        String sentence = "My name is Bisin";
        System.out.println(new SentenceReverse().reverseSentence(sentence));
    }

    public String reverseSentence(String sentence){
        if (sentence.indexOf(" ")<0){
            return sentence;
        }
        return sentence.substring(sentence.lastIndexOf(" ")+1)+" "+reverseSentence(sentence.substring(0,sentence.lastIndexOf(" ")));
    }
}
