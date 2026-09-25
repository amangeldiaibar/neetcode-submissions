class Solution {
    // Time: O(n) Space: O(n)
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int result = 0;
        int l = 0;
        int r = -1;
        while(l<n){
            while(r+1<n && !set.contains(s.charAt(r+1))){
                set.add(s.charAt(r+1));
                r++;
            }
            set.remove(s.charAt(l));
            int windowSize = r-l+1;
            result = Math.max(result,windowSize);
            l++;
        }
        return result;
    }
}