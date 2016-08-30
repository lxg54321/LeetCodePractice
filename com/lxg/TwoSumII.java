package com.lxg;

/**
 * Created by lxg on 2016/8/29.
 *
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int[] ret = {0, 0};
        int i, j;
        int l, r;
        // find center left
        float half = target / 2;
        l = 0;
        r = numbers.length-1;
        i = r/2;
        while (r-l > 1){
            if(numbers[i] > half){
                r = i;
                i = (l + i)/2;
            }
            else if(numbers[i] < half) {
                l = i;
                i = (i + r)/2;
            }
            else {
                if(i>0 && numbers[i-1] == half){
                    l = i-1;
                }
                else {
                    l = i;
                }
                break;
            }
        }
        int centerLeft = l;

        int jMarker = centerLeft+1;
        for(i=centerLeft; i>=0; i--){
            for (j=jMarker; j<numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    ret[0] = i+1;
                    ret[1] = j+1;
                    return ret;
                }
                if(numbers[i] + numbers[j] >= target){
                    jMarker = j;
                    break;
                }
            }
        }
        return ret;
    }

}
