package leetcode;

public class MaxSubarraySum {
    public static int subArraySum(int[] array){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
    int[] array={-2,-3,4,-1,-2,1,5,-3};
       int value= subArraySum(array);
        System.out.print(value);
    }
}
