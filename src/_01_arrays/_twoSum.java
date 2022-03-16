package _01_arrays;

public class _twoSum {

    //https://leetcode.com/problems/two-sum/

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    // TODO Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
}
