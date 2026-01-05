package leetcode;

import java.util.ArrayList;

public class ArrangeElementsBySign {
    public static void rearrangeElements(int[] array){
        if(array==null){
            throw new RuntimeException();
        }
        ArrayList<Integer> positiveList= new ArrayList<>();
        ArrayList<Integer> negativeList= new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                negativeList.add(array[i]);
            }else{
                positiveList.add(array[i]);
            }
        }
        if(positiveList.size()>negativeList.size()){
            rearrangeElmentInOriginalArray(negativeList,positiveList,array);
        }else{
            rearrangeElmentInOriginalArrayPos(negativeList,positiveList,array);
        }
    }

    private static void rearrangeElmentInOriginalArray(ArrayList<Integer> negativeList, ArrayList<Integer> positiveList, int[] array) {
        for(int i=0;i<negativeList.size();i++){
            array[2*i]=positiveList.get(i);
            array[2*i+1]=negativeList.get(i);
        }
        int size=negativeList.size();
        for(int i=negativeList.size()*2;i<array.length;i++){
            array[i]=positiveList.get(size++);
        }
    }
    private static void rearrangeElmentInOriginalArrayPos(ArrayList<Integer> negativeList, ArrayList<Integer> positiveList, int[] array) {
        for(int i=0;i<positiveList.size();i++){
            array[2*i]=positiveList.get(i);
            array[2*i+1]=negativeList.get(i);
        }
        int size=positiveList.size();

        for(int i=positiveList.size()*2;i<array.length;i++){
            array[i]=negativeList.get(size++);
        }
    }

    public static void main(String[] args) {
    int[] array={-11,-2,-3};
        rearrangeElements(array);
        for(int ele:array){
            System.out.print(ele);
        }
    }
}
