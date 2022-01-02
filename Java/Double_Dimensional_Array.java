package SCA;

import java.util.Scanner;

public class Double_Dimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int [] [] arr;
        arr = new int[3] [4];
        // Accessing reference to an Array of reference [3]
        System.out.println(arr.length);

        //Accessing Array of integer [4]
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);


    }
}
