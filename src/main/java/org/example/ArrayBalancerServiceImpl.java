package org.example;

public class ArrayBalancerServiceImpl implements ArrayBalancerService {
    @Override
    public boolean canBalance(int[] nums) {
        var firstSum = 0;
        for (int i = 0; i < nums.length; i++) {
            firstSum += nums[i];
            var secondSum = sumRange(i + 1, nums.length, nums);
            if (firstSum == secondSum) {
                return true;
            }
        }
        return false;
    }

    private int sumRange(int fromIndex, int toIndex, int[] nums) {
        var sum = 0;
        for (int i = fromIndex; i < toIndex; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
