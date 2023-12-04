import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Ejercicio 7
        Reemplaza todas las a del String anterior por una e.
        */

        String message = JOptionPane.showInputDialog(null, "Enter Your Message", "Change 'A' with 'E'", JOptionPane.INFORMATION_MESSAGE);
        char[] charMessage = message.toCharArray();

        for(int i = 0; i <charMessage.length; i++) {
            if(Character.toUpperCase(charMessage[i]) == 'A') {
                charMessage[i] = 'E';
            }
        }
        String newMessage = new String(charMessage).toUpperCase();
        System.out.println(newMessage);
    }
}
