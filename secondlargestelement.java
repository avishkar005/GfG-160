import java.util.*;
public class secondlargestelement {
    static int findingSecondlargest(int [] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }
            else if(num > second && num < first){
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
    public static void main(String[]args){
        int arr[] = { 1,15,7,17,1,19,18};
        int sec = findingSecondlargest(arr);
        System.out.println(sec);
    }
    
}
