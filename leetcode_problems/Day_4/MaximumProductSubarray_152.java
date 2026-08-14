class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<len;i++){
            
            if(prefix == 0)  prefix = 1;
            if(suffix == 0)  suffix = 1;

            prefix *= nums[i];
            suffix *= nums[len-1-i];

            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }
}