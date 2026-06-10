class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] fre = new int[26];
        for (char c : magazine.toCharArray()) {
            fre[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (fre[c - 'a'] == 0) {
                return false;
            }
            fre[c - 'a']--;
        }
        return true;
    }
}