/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author agajkowski
 */
public class DriverGUI {

    public static void main(String[] args) {


        CopierService copier = new CopierService();
        MessageReader messageReader = new GUIReader();
        MessageWriter messageWriter = new GUIWriter();

        copier.copyMessage(messageReader, messageWriter);
    }
}