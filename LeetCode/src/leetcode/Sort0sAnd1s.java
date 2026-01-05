package leetcode;


public class Sort0sAnd1s {
    public static int[] sortOsAnd1s(int[] array){
        int n=array.length-1;
        int low=0;
        int mid=0;
        int high=n;
        while(mid<=high){
            if(array[mid]==0){
                swap(mid,low,array);
                low++;
                mid++;
            } else if (array[mid]==1) {
                mid++;
            }else{
                swap(mid,high,array);
                high--;
            }
        }
        return array;
    }

    private static void swap(int i, int i1,int[] array) {
        int temp=array[i];
         array[i]=array[i1];
         array[i1]=temp;
    }

    public static void main(String[] args) {
        int[] array={0,1,1,0,1,2,1,2,0,0,0};
        int[] result=sortOsAnd1s(array);
        for(int element:result){
            System.out.print(element);
        }

    }
}
