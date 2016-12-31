package com.tutorialspoint.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JavaSwing {
   private JFrame mainFrame;
   private JEditorPane jep;
   public JavaSwing(){
      prepareGUI();
   }
   public static void main(String[] args){
      JavaSwing javaSwing = new JavaSwing();  
      JavaSwing.showEventDemo();       
   }      
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      jep = new JEditorPane();
      jep.setContentType("text/html");
      jep.setEditable(false);
    //   jep.addHyperlinkListener(this);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }
   private static void showEventDemo(){

      
   }
   private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         
      }     
   }
}