class Solution {
    public int strStr(String haystack, String needle) {
        int startIndex = -1;
        
        if (needle.isEmpty()) {
            return 0;
        }
        
        if (haystack.isEmpty()) {
            return startIndex;
        }
        
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needle.length() > haystack.length()) {
                    return -1;
                }
                
                String subStr = haystack.substring(i, i + needle.length());
                if (subStr.equals(needle)) {
                    return i;
                }
            }
        }
        
        return startIndex;
    }
}