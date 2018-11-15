package coding.hardQ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 1. Given a file full of these strings:

 Vivek 1

 Vivek 2

 Ajit 3

 Krishna 4

 Keshav 6

 Keshav 7

 Print the duplicates and the IDs:

 Vivek: 1, 2

 Keshav: 6, 7

 */
public class StringDuplicateIDsFiles {

    public static void main(String[] args) {

        Map<String,List<String>> resultMap = new HashMap<>();
        File file = new File("/Users/vn0hrm0/Desktop/Bisin/MyFolder/Study/tests/Duplicates.txt");
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                if (words.length>=2){
                    if (resultMap.get(words[0])!=null){
                        resultMap.get(words[0]).add(words[1]);
                    }else {
                        List<String> idList = new ArrayList<>();
                        idList.add(words[1]);
                        resultMap.put(words[0],idList);
                    }
                }
            }

            for(Map.Entry<String,List<String>> me : resultMap.entrySet()){
                if (me.getValue().size()>1){
                    System.out.println(me.getKey()+" "+me.getValue());
                }
            }

         /*   scanner.useDelimiter("\\Z");
            System.out.println(scanner.next()); */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
