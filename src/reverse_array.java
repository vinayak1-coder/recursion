import java.util.*;
import java.util.Scanner;

public class reverse_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] arr =new int[];
        int arr[] ={1,5,2,6,7};
        reverse_array ra = new reverse_array();
        ra.reverse(arr,0,4);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr,int l,int r){
        if(l>r){
            return;
        }
        int temp = arr[l];
        arr[l]= arr[r];
        arr[r]= temp;
        reverse(arr, l+1,r-1);
//        for(int i=0;i<5;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
    }

}
