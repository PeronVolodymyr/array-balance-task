package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayBalancerServiceLinearImplTest {

    private final ArrayBalancerService arrayBalancerService = new ArrayBalancerServiceLinearImpl();

    @Test
    void test() {
        int[] nums = {1, 1, 1, 2, 1};
        var result = arrayBalancerService.canBalance(nums);
        assertTrue(result);
    }

    @Test
    void test1() {
        int[] nums = {2, 1, 1, 2, 1};
        var result = arrayBalancerService.canBalance(nums);
        assertFalse(result);
    }

    @Test
    void test2() {
        int[] nums = {10, 10};
        var result = arrayBalancerService.canBalance(nums);
        assertTrue(result);
    }


}