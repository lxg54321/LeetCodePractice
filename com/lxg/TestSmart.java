package com.lxg;

/**
 * Created by lxg on 2016/8/30.
 *
 */
public class TestSmart {

    public float calculateB(int[] lastStr, int strength){

        int length = lastStr.length;
        float x_bar = 1.5f; //(1 + 2 + 3) / 4
        float xixi = 1 + 2*2 + 3*3;
        float ny_bar = 0;
        float xiyi = 0;
        for(int i=0; i<length; i++){
            ny_bar += lastStr[i];
            xiyi += lastStr[i] * i;
        }
        ny_bar += strength;
        xiyi += strength * length;
        float b = (xiyi - ny_bar*x_bar) / (xixi - (length+1)*x_bar*x_bar);

        return b;
    }

}
