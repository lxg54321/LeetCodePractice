package com.company;

/**
 * Created by lxg on 2016/8/28.
 *
 */
public class Solution {

    public String getPermutation(int n, int k) {
        initNumUsed(n);
        initFactorial(n);
        String r = "";

        int t1 = k;
        int t2;
        for(int i=1; i<n; i++){
            t2 = factArray[n-i];
            int m = t1 / t2;
            t1 = t1 % t2;
            if(t1 == 0){
                m--;
                t1 = t2;
            }
            r += getMthNum(m+1);
        }
        r += getMthNum(1);
        return r;
    }

    private boolean[] numUsed = new boolean[10];
    private int[] factArray = new int[10];

    private void initNumUsed(int n){
        for(int i=0; i<numUsed.length; i++){
            if(i<=n){
                numUsed[i] = false;
            }
            else {
                numUsed[i] = true;
            }
        }
    }

    private int getMthNum(int m){
        int count = 1;
        int i;
        for(i=1; i<numUsed.length; i++){
            if(numUsed[i]){
                continue;
            }
            if(count == m){
                numUsed[i] = true;
                return i;
            }
            count ++;
        }
        return i;
    }

    private void initFactorial(int size){
        factArray[1] = 1;
        for(int i=2; i<=size; i++){
            factArray[i] = factArray[i-1] * i;
        }
    }

}
