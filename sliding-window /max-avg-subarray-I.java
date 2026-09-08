class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        double maxSum = 0;
        double maxValue = Double.NEGATIVE_INFINITY;
        
        for(int j=0;j<n;j++){
            maxSum += nums[j];
           
            while ((j-i+1)>k){
                maxSum -= nums[i];
                i++;
            }
            if ((j-i+1) == k)
               maxValue = Math.max(maxValue,maxSum);
        }
        return maxValue/k;
    }
}
