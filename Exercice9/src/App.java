import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Ejercicio 9
        Realizar la suma del 1 al número que indiquemos, 
        este debe ser mayor que 1.
        */

        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your number", "Enter", JOptionPane.INFORMATION_MESSAGE));

        if(input <= 1) {
            System.out.println("Silly, you need to enter a number higher than 1");
        }
        else if(input > 1) {
            int sum = 0;
            for (int i = 1; i <= input; i++) {
                sum += i;
            }
            System.out.println("the sum of numbers from 1 to " + input + " is " + sum);
        }  
    }
}
