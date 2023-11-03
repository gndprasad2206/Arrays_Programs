/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {
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
   for(int i=0;i<column;i++){
     for(int j=0;j<row;j++){
       System.out.print(arr[j][i]+"  ");
     }
     System.out.println();
   }
 }

}