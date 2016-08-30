package com.lxg;

import com.lxg.Common.ListNode;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] results = new ProductOfArrayExceptSelf().productExceptSelf(nums);
        for(int res : results){
            System.out.println(res);
        }
    }

}
