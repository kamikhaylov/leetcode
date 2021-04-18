package com.leetcode.easy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void whenArrAndTargetThenNewArr1() {
        TwoSum twoSum = new TwoSum();
        int[] rsl = twoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
        int[] expected = new int[] {0, 1};
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenArrAndTargetThenNewArr2() {
        TwoSum twoSum = new TwoSum();
        int[] rsl = twoSum.twoSum(new int[] {3, 2, 4}, 6);
        int[] expected = new int[] {1, 2};
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenArrAndTargetThenNewArr3() {
        TwoSum twoSum = new TwoSum();
        int[] rsl = twoSum.twoSum(new int[] {3, 3}, 6);
        int[] expected = new int[] {0, 1};
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenArrAndTargetThenNewArr4() {
        TwoSum twoSum = new TwoSum();
        int[] rsl = twoSum.twoSum(new int[] {-1, -2, -3, -4, -5}, -8);
        int[] expected = new int[] {2, 4};
        assertThat(rsl, is(expected));
    }
}