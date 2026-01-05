package leetcode;


import java.util.HashMap;
import java.util.Map;

public class MajorityElementBetter {

    public static void main(String[] args) {
            int[] array={2,2,3,3,1,2,2};
            int result=checkMajorityElementBetter(array);
            System.out.print(result);

    }

    private static int checkMajorityElementBetter(int[] array) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int element:array){
            hashMap.put(element,hashMap.getOrDefault(element,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()>array.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
