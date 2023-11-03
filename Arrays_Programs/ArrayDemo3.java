
//  Write a program to print the elements of an array present on even position
import java.util.Scanner;

class ArrayDemo3 {

    public static void main(String args[]) {
        int arr[] = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

    }
}
