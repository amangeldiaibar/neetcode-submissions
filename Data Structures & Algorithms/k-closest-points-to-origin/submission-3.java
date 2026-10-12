class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        int max = 0;
        for(int[] point : points){
            int close = (int)Math.pow(point[0],2) + (int)Math.pow(point[1],2);
            max = Math.max(max,close);
        }
        List<int[]>[] list = new List[max+1]; 
        for(int[] point : points){
            int close = (int)Math.pow(point[0],2) + (int)Math.pow(point[1],2);
            list[close] = new ArrayList<>();
        }
        for(int[] point : points){
            int close = (int)Math.pow(point[0],2) + (int)Math.pow(point[1],2);
            list[close].add(point);
        }
        int count = 0;
        for(int i = 0;i<=max;i++){
            if(list[i] == null) continue;
            for(int[] arr : list[i]){
                result[count] = arr;
                count++;
                if(count>=k) return result;
            }
        }
        return result;
    }
}
