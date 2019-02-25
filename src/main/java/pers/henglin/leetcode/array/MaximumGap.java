package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class MaximumGap implements Verification<Integer, Integer> {
    private int maximumGap(int[] nums){
        int length = nums.length;
        if(2 > length){
            return 0;
        }

        int maxNum = nums[0];
        int minNum = nums[0];
        for(int index=1; index<length; index++){
            maxNum = Math.max(maxNum, nums[index]);
            minNum = Math.min(minNum, nums[index]);
        }

        int bucketSize = Math.max(1, (maxNum - minNum) / (length - 1));
        int bucketNum = (maxNum - minNum) / bucketSize + 1;
        Bucket[] buckets = new Bucket[bucketNum];
        for(int index=0; index<bucketNum; index++) {
            buckets[index] = new Bucket();
        }

        for(int num:nums){
            int bucketIdx = (num - minNum) / bucketSize;
            if(!buckets[bucketIdx].used){
                buckets[bucketIdx].minVal = num;
                buckets[bucketIdx].maxVal = num;
            }else{
                buckets[bucketIdx].minVal = Math.min(num, buckets[bucketIdx].minVal);
                buckets[bucketIdx].maxVal = Math.max(num, buckets[bucketIdx].maxVal);
            }
            buckets[bucketIdx].used = true;
        }

        int prevBucketMax = minNum;
        int maxGap = 0;
        for(Bucket bucket:buckets){
            if(!bucket.used){
                continue;
            }
            maxGap = Math.max(maxGap, bucket.minVal - prevBucketMax);
            prevBucketMax = bucket.maxVal;
        }
        return maxGap;
    }

    private class Bucket{
        int minVal = 0;
        int maxVal = 0;
        boolean used = false;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return maximumGap(nums);
    }
}
