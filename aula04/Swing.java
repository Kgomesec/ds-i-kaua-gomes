package aula04;
import javax.swing.*;
public class Swing {

  public static void main(String[] args) {
    /* JOptionPane Java user input example */
    String name = JOptionPane.showInputDialog("What is your name?");
    String output = name + " is such a nice name!";
    JOptionPane.showMessageDialog(null, output);
  }
}