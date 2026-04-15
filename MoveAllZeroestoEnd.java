class Solution {
    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            }
        }
        
    }
    public static void main(String[]args){
        int[]arr = {0,1,2,0,9,0,6,5};
        pushZerosToEnd(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}