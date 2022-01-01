package SCA;

import java.util.Scanner;

public class Array_Lenth_Property {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr ={10,20,30,40,50,60};
        //Normal Array Printing
        System.out.println("This is Normal Array Printing");
        System.out.println("Size of array is :"+arr.length);
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println();
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println();
        
        System.out.println("This is Reverse Array Printing");
        //Reverse Array printing
        System.out.println("Array size is :"+arr.length);
        for (int i=arr.length -1; i>=0; i--){
            System.out.println(arr[i]);
        }

    }
}
