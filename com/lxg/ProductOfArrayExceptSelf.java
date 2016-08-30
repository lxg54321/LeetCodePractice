package com.lxg;

/**
 * Created by lxg on 2016/8/30.
 *
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i=1; i<nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        int temp = 1;
        for (int i=nums.length-2; i>=0; i--){
            temp = temp * nums[i+1];
            result[i] *= temp;
        }
        return result;
    }
}
