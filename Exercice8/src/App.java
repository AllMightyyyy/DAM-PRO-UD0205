import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Ejercicio 8
        Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII. 
        Muéstralos en línea recta, separados por un espacio entre cada carácter.
        */

        String message = JOptionPane.showInputDialog(null, "Enter your message", "Change your message into ASCII code", JOptionPane.INFORMATION_MESSAGE);

        char[] messageArray = message.toCharArray();

        int[] ASCIIArray = new int[messageArray.length];
        
        for(int i = 0; i < messageArray.length; i++) {
            ASCIIArray[i] = (int) messageArray[i];
        }

        for(int c : ASCIIArray) {
            System.out.print(c + " ");
        }
    }
}
