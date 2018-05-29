package pers.henglin.leetcode.array;

import com.google.gson.Gson;
import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/21.
 */
public class MedianOfTwoSortedArrays implements Verification<Integer[], Double> {
    private Double medianOfTwoSortedArrays(Integer[] num1, Integer[] num2){
        int num1Len = num1.length;
        int num2Len = num2.length;
        if(num1Len > num2Len){// to ensure num1Len <= num2Len
            Integer[] temp = num1;
            num1 = num2;
            num2 = temp;

            Integer tmp = num1Len;
            num1Len = num2Len;
            num2Len = tmp;
        }
        int low = 0;
        int high = num1Len;
        int halfLen = (num1Len + num2Len + 1) / 2;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = halfLen - mid1;
            // mid1 is too small
            if (mid1 < high && num2[mid2 - 1] > num1[mid1]){
                low = low + 1;
            // mid1 is too big
            }else if (mid1 > low && num1[mid1 - 1] > num2[mid2]) {
                high = high - 1;
            }else{// mid1 is perfect
                double maxLeft;
                if (mid1 == 0){
                    maxLeft = num2[mid2 - 1];
                }else if(mid2 == 0){
                    maxLeft = num1[mid1 - 1];
                }else{
                    //C(k-1)
                    maxLeft = Math.max(num1[mid1 - 1], num2[mid2 - 1]);
                }
                if((num1Len + num2Len) % 2 == 1 ){
                    return maxLeft;
                }

                int minRight;
                if(mid1 == num1Len){
                    minRight = num2[mid2];
                }else if(mid2 == num2Len){
                    minRight = num1[mid1];
                }else{
                    //C(k)
                    minRight = Math.min(num2[mid2], num1[mid1]);
                }
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

    @Override
    public Double verify(Integer[]... input) {
        return medianOfTwoSortedArrays(input[0], input[1]);
    }
}
