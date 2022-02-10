class Solution {
        
    static HashMap<Character, Character> bracketMap = new HashMap();
    static {
        bracketMap.put('(', ')');
        bracketMap.put('{', '}');
        bracketMap.put('[', ']');
    }
    
    // 1. Stack이 비어있으면 character를 넣음
    
    public boolean isValid(String s) {        
        Stack<Character> charStack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char charAtIndex = s.charAt(i);
            
            if (charStack.isEmpty()) {
                charStack.add(charAtIndex);  
                continue;
            }
            
            char lastChar = charStack.peek();
            Character bracket = bracketMap.get(lastChar);
            
            if(bracket != null && bracket == charAtIndex) {
                charStack.pop();
            } else {
                charStack.add(charAtIndex);
            }
        }
        
        if (charStack.isEmpty()) {
            return true;
        }
        
        return false;
    }
}