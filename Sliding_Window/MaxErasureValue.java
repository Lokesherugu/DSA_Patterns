// File: Easy/MaxErasureValue.java
import java.util.*;

public class MaxErasureValue {
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int left = 0, sum = 0, max = 0;

        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                sum -= nums[left];
                set.remove(nums[left++]);
            }
            sum += nums[right];
            set.add(nums[right]);
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 5, 6};
        System.out.println("Max Erasure Value: " + maximumUniqueSubarray(nums)); // Output: 17
    }
}
