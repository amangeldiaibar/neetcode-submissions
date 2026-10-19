class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<List<Integer>> list = new ArrayList<>();
        int n = position.length;
        for(int i = 0;i < n;i++){
            list.add(List.of(position[i],speed[i]));
        }
list.sort((a, b) -> Integer.compare(b.get(0), a.get(0)));
        int fleets = 1;
        double prevFleet = (double)(target - list.get(0).get(0))/list.get(0).get(1);
        for(int i = 1;i<n;i++){ 
            List<Integer> lis = list.get(i);
            double steps = (double)(target - lis.get(0))/lis.get(1); 
            if(steps>prevFleet) {
                fleets++;
                prevFleet = steps;
            }
        }
        return fleets;
    }
}
