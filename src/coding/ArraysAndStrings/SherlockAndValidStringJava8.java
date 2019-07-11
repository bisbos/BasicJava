package coding.ArraysAndStrings;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SherlockAndValidStringJava8 {

    public static void main(String[] args) {
        String s ="aabcd";
        System.out.println(getValidString(s));

    }

    private static boolean getValidString(String s) {
        // Walk over the characters and count occurence of each character
        Map<Character, Long> charOccurs = s.chars().
                mapToObj(t -> (char) t).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charOccurs);

        // Then we're going to map each amount of characters found to its count,
        // e.g. in the string "aabbcc" each character occurs twice → [2, 2, 2].
        // That will yield a map: [2=3]
        Map<Long, Long> counts = charOccurs.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(counts);

        switch (counts.size()) {
            // If all characters occur an equal number of times, then the map
            // contains just a single entry.
            case 1:
                return true;

            // If there are two different amounts, then the difference between
            // those two must be 1. Also, one of the numbers must occur exactly
            // once.
            case 2:
                Iterator<Long> it = counts.keySet().iterator();
                boolean diff = Math.abs(it.next() - it.next()) == 1;
                return (diff && (counts.values().stream()
                        .anyMatch(i -> i == 1)));

            // If the map's size is 3 or more, there are differents of amounts of
            // characters.
            default:
                return false;
        }
    }
}
