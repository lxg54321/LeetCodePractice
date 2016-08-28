package com.lxg;

/**
 * Created by lxg on 2016/8/28.
 *
 */
public class ReverseString {
    public String reverseString(String s) {
        int len = s.length();
        char[] cs = new char[len];
        for (int i=0; i<len; i++){
            cs[len-i-1] = s.charAt(i);
        }
        return new String(cs);
    }
}
