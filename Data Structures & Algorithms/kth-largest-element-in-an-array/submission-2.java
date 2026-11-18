class Solution {
    // Time: O(nlogk) Space: O(k)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int num : nums){
            pq.offer(-num);
        }
        while(pq.size() != n - k+1){
            pq.poll();
        }
        return -pq.poll();
    }
}
