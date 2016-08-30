package com.lxg;

/**
 * Created by lxg on 2016/8/29.
 *
 */
public class AddDigits {
    public int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        int a = num % 9;
        if(a == 0){
            a = 9;
        }
        return a;
    }
}
