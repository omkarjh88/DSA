package leetcode;

public class TwoPointerTwoSum {
    public static int[] twoPointerSum(int[] array, int target){
        if(array.length == 0){
            throw new RuntimeException("array length is less than zero");
        }
        int left=0;
        int right=array.length-1;
        while(left<=right){
            if(array[left]+array[right]==target){
                return new int[]{left,right};
            } else if (array[left]+array[right]<target) {
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] array={2,5,6,8,11};
       int[] result= twoPointerSum(array,25);
       for(int value:result){
           System.out.println(value);
       }
    }
}
