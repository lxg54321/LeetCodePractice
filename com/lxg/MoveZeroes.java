package com.lxg;

/**
 * Created by lxg on 2016/8/30.
 *
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0, j=1;
        while(j < nums.length){
            if(nums[i] != 0){
                i++;
                j++;
                continue;
            }
            if(nums[j] == 0){
                j++;
                continue;
            }
            nums[i] = nums[j];
            nums[j] = 0;
            i++;
            j++;
        }
    }
}
