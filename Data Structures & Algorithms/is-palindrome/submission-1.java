class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !isAlphaNum(s.charAt(l))) l++;

            while (l < r && !isAlphaNum(s.charAt(r))) r--;

            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l++;
                r--;
            } else
                return false;
        }
        return true;
    }

    private static boolean isAlphaNum(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
}
