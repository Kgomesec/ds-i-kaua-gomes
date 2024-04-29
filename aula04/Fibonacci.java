package aula04;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int[] Fibonacci = new int[8];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;

        for (int i = 2; i < 8; i++) {
            Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
        }

        String output = Arrays.toString(Fibonacci);
        JOptionPane.showMessageDialog(null, output);
    }
}
