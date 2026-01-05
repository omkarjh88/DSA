package leetcode;

public class MajorityElementBrute {
    public static int checkMajorityElement(int[] array){
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count>array.length/2){
                return array[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] array={2,2,3,3,1,4,4};
        int result=checkMajorityElement(array);
        System.out.print(result);

    }
}
