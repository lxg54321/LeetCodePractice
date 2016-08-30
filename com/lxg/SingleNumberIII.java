package com.lxg;

/**
 * Created by lxg on 2016/8/30.
 *
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i=0; i<nums.length; i++){
            xor ^= nums[i];
        }
        int dist = xor & (-xor);
        int[] ret = {0, 0};
        for (int i=0; i<nums.length; i++){
            if((dist & nums[i]) != 0){
                ret[0] ^= nums[i];
            }
            else {
                ret[1] ^= nums[i];
            }
        }
        return ret;
    }
}
