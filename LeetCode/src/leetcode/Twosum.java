package leetcode;

class Solution {
    public static  int[] twoSum(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] nums={2,3,5,6};
        int[] array=twoSum(nums,9);
        System.out.println(array[0]+" "+array[1]);
    }
}