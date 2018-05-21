package pers.henglin.leetcode.array;

import com.google.gson.Gson;
import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/21.
 */
public class MedianOfTwoSortedArrays implements Verification<Integer[], Double> {
    private Double medianOfTwoSortedArrays(Integer[] A, Integer[] B){
        int m = A.length;
        int n = B.length;
        if(m > n){// to ensure m<=n
            Integer[] temp = A; A = B; B = temp;
            Integer tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = iMin + 1; // i is too small
            }else if (i > iMin && A[i-1] > B[j]) {
                iMax = iMax - 1; // i is too big
            }else{// i is perfect
                double maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

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
