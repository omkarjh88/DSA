package leetcode;

public class LargestNumber {
    public static int largestNumber(int[] array) throws IllegalAccessException{
        int largest=Integer.MIN_VALUE;
        if(array==null||array.length==0){
            throw new IllegalAccessException("array is null or array size is zero");
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) throws IllegalAccessException {
        int[] array={7,9,5,11,32,0,-5};
        System.out.println(largestNumber(array));

    }
}
