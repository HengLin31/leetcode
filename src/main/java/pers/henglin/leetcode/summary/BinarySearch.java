package pers.henglin.leetcode.summary;

public class BinarySearch {
    /*
         nums[low] < target <= nums[high]
     */
    public int searchInsert(int[] nums, int target){
        int low = -1;
        int high = nums.length;

        while(high - low > 1){
            int mid = (high - low) / 2 + low;
            // If nums[mid] >= target, assign end as mid.
            // So nums[mid] >= target guarantees nums[high] >= target which exactly matches our invariant relation.
            if(nums[mid] >= target){
                low = mid;
            }else{
                // If nums[mid] < target, assign start as mid.
                // So nums[mid] < target guarantees nums[start] < target which exactly matches our invariant relation.
                high = mid;
            }
        }
        // After quitting from the loop, our invariant relation nums[start] < target <= nums[end]  still maintains since we don't modify it during the loop.
        // If target == nums[end], we should return end with no doubt. If nums[start] < target < nums[end], then the insert position is end.
        return low;
    }

    /*
        nums[low] <= target < nums[high]
     */
    public long sqrt(int x){
        long low = -1;
        long high = x + 1;

        while(high - low > 1){
            long mid = (high - low) / 2 + low;
            // Since our invariant relation is nums[low] <= target < nums[high] now,
            // using nums[mid] > target to maintain it.
            if(mid * mid > x){
                high = mid;
            }else{
                low = mid;
            }
        }
        // Based on the invariant relation,
        // the return should be start for this problem.
        return low;
    }

    /*
        search for a range
     */
    public int searchTheFirst(int[] nums, int low, int high, int target){
        while(high - low > 1){
            int mid = (high - low) / 2 + low;
            if(nums[mid] < target){
                low = mid;
            }else{
                high = mid;
            }
        }
        return nums[low] == target ? low : -1;
    }

    public int searchTheLast(int[] nums, int low, int high, int target){
        while(high - low > 1){
            int mid = (high - low) / 2 + low;
            if(nums[mid] <= target){
                low = mid;
            }else{
                low = mid;
            }
        }
        return nums[low] == target ? low : -1;
    }

    public int searchTheFirst(int[] nums, int target){
        int left = -1;
        int right = nums.length;
        return searchTheFirst(nums, left, right, target);
    }

    public int searchTheLast(int[] nums, int target){
        int left = -1;
        int right = nums.length;
        return searchTheLast(nums, left, right, target);
    }

    public int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        int leftIndex = searchTheFirst(nums, target);
        if(-1 == leftIndex){
            return result;
        }
        result[0] = leftIndex;

        int rightIndex = searchTheLast(nums, target);
        result[1] = rightIndex;

        return result;
    }
}
