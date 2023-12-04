import javax.swing.JOptionPane;

public class App {
    
    /*
     * Ejercicio 5
        Pide por teclado dos números y genera 10 números aleatorios entre esos números. 
        Usa el método Math.random para generar un número entero aleatorio 
        (recuerda el casting de double a int).
     */
    
    public static void main(String[] args) throws Exception {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number", "Enter your numbers", JOptionPane.DEFAULT_OPTION));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number", "Enter your numbers", JOptionPane.DEFAULT_OPTION));
        int range = (Math.max(number1, number2) - Math.min(number1, number2)) - 1;
        
        for(int i = 0; i < 10; i++){
            int rand = (int) (Math.random() * range) + Math.min(number1, number2);
            System.out.println(rand);
        }
    }
}
