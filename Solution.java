class Solution {
    int firstOccurence(String txt, String pat) {
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            if (txt.substring(i, i + pat.length()).equals(pat)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstOccurence("AAAA", "BAAA"));
    }
}