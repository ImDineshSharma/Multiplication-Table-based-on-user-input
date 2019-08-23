// Enter any value(int) and it will print the Multiplication table for that value

import java.util.Scanner
public class Table{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any numarical value");
    int input = sc.nextInt();
    
    for(int counter = 1; counter<=10; counter++){
      System.out.println( input + "x" + counter +  " = " + input*counter);
    }
    
  }
}
