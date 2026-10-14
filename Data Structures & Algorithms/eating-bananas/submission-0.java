class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int l = 0;
      int r = piles[0];
      for(int pile : piles){
        r = Math.max(r,pile);
      }  
      r += 1;
      while(l+1<r){
        int speed = l + (r-l)/2;
        long totalTime = 0;
        for(int pile : piles){
            totalTime += (int)Math.ceil((double)pile/speed);
        }
        if(totalTime>h){
            l = speed;
        }else{
            r = speed;
        }
      }
      return r;
    }
}
