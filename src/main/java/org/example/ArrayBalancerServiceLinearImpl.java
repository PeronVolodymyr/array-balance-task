package org.example;

public class ArrayBalancerServiceLinearImpl implements ArrayBalancerService {


    @Override
    public boolean canBalance(int[] nums) {
        var numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }
        var leftSum = 0;
        for (int j = 0; j < nums.length; j++) {
            leftSum += nums[j];
            if (numsSum - leftSum == leftSum) {
                return true;
            }
        }
        return false;
    }
}
