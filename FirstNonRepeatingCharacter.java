import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeatingCharacter {
    public static int findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {  
            if (charCounts.get(c) == 1) {
                return c; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String input = "aabbcc";
        int result = findFirstNonRepeatingCharacter(input);
        System.out.println(result == -1 ? -1 : (char)result);
    }
}