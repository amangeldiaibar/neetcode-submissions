class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] list = new List[n+1];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
            list[i+1] = new ArrayList<>(); 
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int count = 0;
        int j = n;
        for(int i = n;i > 0;i--){
            for(int num : list[i]){
                if(j-n>=k) return result;
                result[j-n] = num;
                j++;
            }
        }
        return result;
// [],[1],[],[3,2],[],[],[]

    }
}
