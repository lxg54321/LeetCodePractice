package com.lxg;

/**
 * Created by lxg on 2016/8/28.
 *
 */
public class CountingBits {

    public int[] countBits(int num) {
        int[] bitNum = new int[num+1];
        bitNum[0] = 0;
        for(int i=1; i<=num; i++){
            if(i % 2 == 0){
                bitNum[i] = bitNum[i/2];
            }
            else {
                bitNum[i] = bitNum[i-1] + 1;
            }
        }
        return bitNum;
    }

}
