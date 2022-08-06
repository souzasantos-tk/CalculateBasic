
package calculateBasic;

import java.util.Scanner;

public class calculateBasic {

  public static void main(String[] args) {
      
    Scanner input = new Scanner (System.in);
  
        int x;
        int y;
        
        System.out.println("Primeiro Numero");
         x = input.nextInt();
        System.out.println("Segundo Numero");
         y = input.nextInt();
    
        System.out.println(x + y);
       
        System.out.println(x - y);
    
        System.out.println(x / y);
      
        System.out.println(x * y);
      
    }
 }