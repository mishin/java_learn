/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author ira
 * Change the following program to use compound assignments:
 */
public class ArithmeticDemo1 {
      public static void main (String[] args){
          
          int result = 1 + 2; // result is now 3
          System.out.println(result);

          result -=  1; // result is now 2
          System.out.println(result);

          result *= 2; // result is now 4
          System.out.println(result);

          result /=  2; // result is now 2
          System.out.println(result);

          result += 8; // result is now 10
          result %= 7; // result is now 3
          System.out.println(result);
     }
}
