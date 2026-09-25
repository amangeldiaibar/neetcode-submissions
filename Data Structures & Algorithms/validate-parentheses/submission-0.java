class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for(int i = 0;i <s.length();i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '(' || ch == '{'){
                stack.push(ch);
            }else if(stack.isEmpty()){
                return false;
            }else{
                if(map.get(ch) != stack.pop()) return false;
            }
        }
        return stack.isEmpty();
    }
}
