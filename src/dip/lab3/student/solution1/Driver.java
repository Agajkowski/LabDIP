/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author agajkowski
 */
public class Driver {
    
    public static void main(String[] args) {
        CopierService copier = new CopierService();
        MessageReader messageReader = new KeyboardReader();
        MessageWriter messageWriter = new WriteToScreen();
        
        copier.copyMessage(messageReader, messageWriter);
    }
       
}
