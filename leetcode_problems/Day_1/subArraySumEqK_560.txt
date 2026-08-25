class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        int count = 0;
        for(int left=0;left<n;left++){
            sum = 0;
            for (int right = left; right < n; right++) {

                sum += nums[right];

                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}