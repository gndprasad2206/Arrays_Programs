/*Challenge- 3: 

You have been assigned the task of creating a program that implements a stack using an array in java. 

The program should include error handling to handle any exceptions that may arise during the execution.  

You need to test the program with various inputs and ensure that it works as expected. 

The program should accept the following commands from the user: 

1. push <value>: Add an element to the top of the stack 

2. pop: Remove the element at the top of the stack 

3. peek: Display the element at the top of the stack 

4. display: Display all the elements in the stack 

5. exit: Terminate the program 

For push and pop commands, the program should display the stack after the operation, along with any error messages if the stack is full or empty. 

For peek and display commands, the program should display the element(s) or the entire stack, along with any error messages if the stack is empty. 

The program should terminate gracefully when the user enters the exit command. 
*/
import java.util.*;
class Stack_7{
  int stackArray[];
  int top;
  int maxsize;
  public Stack_7(int size){
    maxsize=size;
    stackArray=new int[size];
    top=-1;
  }
  public void addElement(int num){
    if(isFull()==false){
      top++;
      stackArray[top]=num;
      System.out.println("Element Added Successfullu");
    } 
    else{
      System.out.println("Stack is full");
    }
    
  }
  public void removeElement(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
    }
    else{
      int popElement=stackArray[top];
      System.out.println("Removed Element: "+popElement);
      top--;
    }
  }
  public void peekElement(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
    }
    else{
      int popElement=stackArray[top];
      System.out.println("Top Element: "+popElement);
    }
  }
  public void displayAll(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
    }
    else{
      for(int i=0;i<=top;i++){
        System.out.print(stackArray[i]+" ");
      }
    }
  }
  public boolean isEmpty(){
    return (top==-1);
  }
  public boolean isFull(){
    return (top>=maxsize);
  }
}
public class StackArray{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter The size of stack: ");
    int size=sc.nextInt();
    Stack_7 s=new Stack_7(size);
    while(true){
      System.out.println();
      System.out.println("1. push <value>: Add an element to the top of the stack\n2. pop: Remove the element at the top of the stack\n3. peek: Display the element at the top of the stack\n4. display: Display all the elements in the stack\n5. exit: Terminate the program\nSelect One Option");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.print("Enter the Value: ");
          int val=sc.nextInt();
          s.addElement(val);
          break;
        case 2:
          s.removeElement();
          break;
        case 3:
          s.peekElement();
          break;
        case 4:
          s.displayAll();
          break;
        case 5:
          System.exit(0);
      }
    }
  }
}
