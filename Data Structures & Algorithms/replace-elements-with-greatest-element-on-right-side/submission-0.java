class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        result[n-1] = -1;
        for(int i = n-1;i>0;i--){
            result[i-1] = Math.max(result[i],arr[i]);
        }
        return result;
    }
}