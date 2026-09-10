import java.util.HashSet;
import java.util.Set;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long Sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                Sum -= nums[left];
                left++;
            }
            Sum+=nums[right];
            set.add(nums[right]);
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, Sum);
                set.remove(nums[left]);
                Sum -= nums[left];
                left++;
            }
        }
       return maxSum;
    }
}