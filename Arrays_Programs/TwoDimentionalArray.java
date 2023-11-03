/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows:");
   int row=sc.nextInt();
   System.out.print("Enter number of columns: ");
   int column=sc.nextInt();
   int arr[][]=new int[row][column];
   System.out.println("Enter the values into array");
   for(int i=0;i<row;i++){
     for(int j=0;j<column;j++){
       arr[i][j]=sc.nextInt();
     }
   }
    int large=0,index1=0,index2=0;
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        if(large<arr[i][j]){
          large=arr[i][j];
          index1=i;
          index2=j;
        }
      }
    }
    System.out.println("Largest element in array is "+large+" and its index position is arr ["+index1+"] ["+index2+"] ");
  }

}