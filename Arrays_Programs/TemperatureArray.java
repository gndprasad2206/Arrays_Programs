/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class TemperatureArray{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of days ");
    int days=sc.nextInt();
    double temp[]=new double[days];
    for(int i=0;i<days;i++){
      System.out.println("Enter the temperature of Day :"+(i+1));
      temp[i]=sc.nextDouble();
    }
    double low=temp[0];
    for(int i=0;i<days;i++){
      if(low>temp[i])
        low=temp[i];
    }
    System.out.println("The lowest temperature of the week "+days+" is "+low+" celsius");
  }


}