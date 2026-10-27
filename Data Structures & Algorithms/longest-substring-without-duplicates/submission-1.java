class Solution {
    // Time: O(n) Space: O(n)
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = -1;
        int n = s.length();
        int result = 0;
        Set<Character> set = new HashSet<>();
        while(l < n){
            while(r + 1< n && !set.contains(s.charAt(r+1))){
                r++;
                set.add(s.charAt(r));
            }
            result = Math.max(result,r-l+1);
            set.remove(s.charAt(l));
            l++;
        }
        return result;
    }
}
// x size = 1 l = 0 r = 0