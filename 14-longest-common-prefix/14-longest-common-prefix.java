class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char prefixParticipant = Character.MIN_VALUE;
        int prefixIndex = 0;
        boolean exitFlag = false;

        arrayexit:
        while(!exitFlag) {
            for (String str : strs) {
                if (prefixIndex >= str.length()) {
                    return sb.toString();
                }

                if (prefixParticipant == Character.MIN_VALUE) {
                    prefixParticipant = str.charAt(prefixIndex);
                }

                if (prefixParticipant != str.charAt(prefixIndex)) {
                    exitFlag = true;
                    break arrayexit;
                }
            }

            sb.append(prefixParticipant);
            prefixIndex++;
            prefixParticipant = Character.MIN_VALUE;
        }

        return sb.toString();
    }
}