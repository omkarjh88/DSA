package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {
    public static HashMap<Integer, Integer> SubArraySum(int[] array){
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int element:array){
            if(hashMap.containsKey(element)){
                hashMap.put(element,hashMap.get(element)+1);
            }else{
               hashMap.put(element,1);
            }
           // hashMap.put(element,hashMap.getOrDefault(element,0)+1);
        }
        return hashMap;
    }
    public static void main(String[] args) {
        int[] array= {1,2,3,1,1,1,4,2,3};
        HashMap<Integer,Integer> hashMap=SubArraySum(array);
        printMapElements(hashMap);
    }

    private static void printMapElements(HashMap<Integer,Integer> hashMap) {
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" -->"+entry.getValue()+"  ");
        }
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Duplicate element is "+entry.getKey());
            }
        }
    }
}
