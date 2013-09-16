/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;


public class WriteToScreen implements MessageWriter {

    @Override
    public void outputMessage(String message) {
        System.out.println(message);
    }
    
}
