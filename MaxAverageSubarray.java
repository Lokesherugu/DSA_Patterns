// File: Easy/MaxAverageSubarray.java
public class MaxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double maxSum = 0, currSum = 0;
        for (int i = 0; i < k; i++) currSum += nums[i];
        maxSum = currSum;
        for (int i = k; i < nums.length; i++) {
            currSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("Max Average: " + findMaxAverage(nums, k)); // Output: 12.75
    }
}
