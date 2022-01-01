package SCA_Leactures;

import java.util.Scanner;

public class DisplaySumAndAvarage {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int []arr;
    int n;
    System.out.println("Enter the value");
    arr = new int[n];
    for(int i=0; i<n; i++){
        System.out.println("Enter the number");
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0; i<n; i++){
        System.out.println(arr[i]);
        sum = sum+arr[i];
    }
    System.out.println("The sum is :"+ sum);
    System.out.println("The Avarage is :"+(float)(sum/n));
    
}
}
