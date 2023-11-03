//Java program to demonstrate Two Dimensional Array in Java

public class ArrayDemo2 {
    
	public static void main(String ...x) {
	    
	// Declaring a Two Dimesional with 3 rows and 3 columns and Initializing it
	// Default value of each element is zero until it is initialized
	int numbers[][]={{1,2,3},{4,5,6},{7,8,9}};

	// Looping Down the array to print the values. 
	// Row loop runs till less than array.length
	for(int i=0;i<numbers.length;i++) {

	// Column loop runs till less than each row length
	 for(int j=0; j<numbers[i].length;j++) {
		System.out.print(numbers[i][j]+" ");
		}
		
	// New Line after each row to show output in a matrix format
	System.out.println();
	}
   }
 }