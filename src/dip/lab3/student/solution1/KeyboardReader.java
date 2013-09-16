/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;


public class KeyboardReader implements MessageReader {
    Scanner keyboard = new Scanner(System.in);
    
    
    @Override
    public String getMessage() {
      String tempString;
      System.out.println("please input a message");
      tempString = keyboard.nextLine();
      return tempString;
    }
    
    
}
