class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitWords = s.split(" ");
        
        return splitWords[splitWords.length - 1].length();
    }
}