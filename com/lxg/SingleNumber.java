package com.lxg;

/**
 * Created by lxg on 2016/8/29.
 *
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}
