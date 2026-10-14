class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = -1;
        int r = n;
        while(l+1<r){
            int m = l + (r-l)/2;
            if(nums[m]>nums[n-1]){
                l = m;
            }else{
                r = m;
            }
        }

        if(l == -1){
            int l2 = -1;
            int r2 = n;
            while(l2+1<r2){
                int m = l2 + (r2-l2)/2;
                if(nums[m]<target){
                    l2 = m;
                }else{
                    r2 = m;
                }
            }
            if(r2 == n || nums[r2] != target) return -1;
            return r2;
        }
        int l2 = -1;
        int r2 = r;
        int l3 = l;
        int r3 = n-1;
        while(l2+1<r2){
            int m = l2 + (r2-l2)/2;
            if(nums[m]<target){
                l2 = m;
            }else{
                r2 = m;
            }
        }
        if(nums[r2] == target) {
            return r2;
        }

        while(l3+1<r3){
            int m = l3 + (r3-l3)/2;
            if(nums[m]<target){
                l3 = m;
            }else{
                r3 = m;
            }
        }
        if(nums[r3] != target) return -1;
        return r3;
    }
}
