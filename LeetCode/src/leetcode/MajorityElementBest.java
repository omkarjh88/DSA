package leetcode;

public class MajorityElementBest {
    private static int checkMajorityElementBest(int[] array) {
        int count=0;
        int element = 0;
        for(int i=0;i<array.length;i++){
            if(count==0){
                element=array[i];
            } else if (element==array[i]) {
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int ele:array){
            if(ele==element){
                count1++;
            }
        }
        if(count1>array.length/2){
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array={2,2,3,3,1,4,4};
        int result=checkMajorityElementBest(array);
        System.out.print(result);

    }


}
