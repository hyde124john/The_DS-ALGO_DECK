class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int j = 0; 
        for (int i = 0; i < n && j < m; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);
            if (c1 == c2 || ((c1 - 'a' + 1) % 26 + 'a') == c2) {
                j++;
            }
        }
        return j == m;
    }
}
