/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author agajkowski
 */
public class CopierService {

    public void copyMessage(MessageReader readMessage, MessageWriter writeMessage) {
        String tempString = readMessage.getMessage();
        writeMessage.outputMessage(tempString);

    }
}
