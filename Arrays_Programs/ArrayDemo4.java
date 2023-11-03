//  Write a program to create a two dimensional array with duplicate elements and print only the duplicate elements.
import java.util.Scanner;
class ArrayDemo4 {

	public static void main(String args[]) {
    int arr[][]=new int[4][4];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
		    
   }
}
