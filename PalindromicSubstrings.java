import java.util.HashSet;
import java.util.Set;
public class PalindromicSubstrings {
    public static int countDistinctPalindromicSubstrings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        s = s.toLowerCase();
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    palindromes.add(sub);
                }
            }
        }
        return palindromes.size();
    }
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
    public static void main(String[] args) {
        String s1 = "Madam Arora teaches Malayalam";
        String s2 = "Nitin speaks Malayalam";
        System.out.println("\"" + s1 + "\" has " + countDistinctPalindromicSubstrings(s1) + " distinct palindromic substrings.");
        System.out.println("\"" + s2 + "\" has " + countDistinctPalindromicSubstrings(s2) + " distinct palindromic substrings.");
    }
}