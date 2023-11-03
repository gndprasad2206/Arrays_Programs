import java.util.Scanner;

//Java program to demonstrate Single Dimensional Array in Java

public class ArrayDemo_1 {
	// Array in method arguments can be denoted by 3 dots also
	public static void main(String[]args)
	{	
	// Declaring and Creating an Array of length 7
	int arr[]=new int[7];
    Scanner sc=new Scanner(System.in);
	// Declaring and Initializing an Array. It initializes the length with number of elements i.e., 7
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
	int arr1[]= {1,2,3,4,5,6,7};
	
	// Looping down the array
    System.out.println("Array elements");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
	for(int i=0;i<arr1.length;i++)
	{
	// Printing tlhe Array elements
	System.out.print(arr1[i]+" ");
	}
  }
}