class Solution {
    public int trap(int[] height) {
        int n = height.length; // 10
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
        int[] arr1 = new int[n]; // 0 - 9
        int[] arr2 = new int[n]; // 0 - 9
        for(int i = n-1 ;i >= 0;i--){ // 9 - 0
            arr1[(n-1) - i] = leftMax; // 0 0 2 
            leftMax = Math.max(height[(n-1)-i],leftMax); // 2
            arr2[i] = rightMax; // 2
            rightMax = Math.max(height[i],rightMax); //.   1 0
        }
        for(int i = 0;i < n;i++){
            int water = Math.min(arr1[i],arr2[i]);
            if(water - height[i]<=0){
                continue;
            }
            result += water - height[i];
        }
        return result;
    }
}
