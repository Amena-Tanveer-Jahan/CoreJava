package cj8.streams;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CharacterCount {
    static void main() {
        String str = "Hello World";
        Map<Character, Long> count = str.chars().mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(w -> w, TreeMap::new, Collectors.counting()));
        System.out.println(count);
    }
}
