class Solution {
    public boolean isPalindrome(String s) {
        int p1 =0;
        int p2 = s.length()-1;
        while(p1<=p2){
            if(!Character.isLetterOrDigit(s.charAt(p1))){
                p1++;
                continue;
            }else if(!Character.isLetterOrDigit(s.charAt(p2))){
                p2--;
                continue;
            }
            char ch1 = Character.toLowerCase(s.charAt(p1));
            char ch2 = Character.toLowerCase(s.charAt(p2));
            if(ch1 != ch2) return false;
            p1++;
            p2--;
        }
        return true;
    }
}
