package com.lxg;

/**
 * Created by lxg on 2016/8/28.
 *
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char ret = 'a';

        int[] sLetterNum = new int[26];
        int[] tLetterNum = new int[26];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            sLetterNum[c-'a'] ++;
        }

        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            tLetterNum[c-'a'] ++;
        }

        for(int i=0; i<tLetterNum.length; i++){
            if(tLetterNum[i] > sLetterNum[i]){
                int temp = i+'a';
                ret = (char)temp;
            }
        }

        return ret;
    }

}
