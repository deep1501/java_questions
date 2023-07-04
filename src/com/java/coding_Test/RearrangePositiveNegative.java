package com.java.coding_Test;

public class RearrangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {2, 4, -6, 8, -5, -10};
        int[] reArrangedArray = reArrange(arr);
        for(int i=0; i<reArrangedArray.length; i++){
            System.out.print(reArrangedArray[i]+" ");
        }
    }

    private static int[] reArrange(int[] arr) {
        int even_index= 0;
        int odd_index= 1;
        int[] result = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                result[even_index] = arr[i];
                even_index=even_index+2;
            }else{
                result[odd_index]=arr[i];
                odd_index=odd_index+2;
            }
        }
        return result;
    }
}
