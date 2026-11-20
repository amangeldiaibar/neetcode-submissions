class Solution {
    public int lastStoneWeight(int[] stones) {
    if(stones.length==1) return stones[0];
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    // O(nlogn)
    for(int stone : stones){
        pq.offer(-stone);
    }  
    while(pq.size()>1){
        int num1 = pq.poll();
        int num2 = pq.poll();
        if(num1==num2){
            continue;
        }else{
            pq.offer(-Math.abs(num1-num2));
        }
    }
    return pq.size() == 0 ? 0:-pq.poll();
    }
}
