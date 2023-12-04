import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    /*
    Ejercicio 6
    Del siguiente String “La lluvia en Sevilla es una maravilla” 
    cuenta cuantas vocales hay en total 
    (recorre el String con charAt).
    */

    char[] vowelList= {'A', 'E', 'I', 'O', 'U'};
    String input = JOptionPane.showInputDialog(null, "Enter your message to check how many vowels", "Vowel Checker", JOptionPane.INFORMATION_MESSAGE);
    int counter = 0;

    for(int i = 0; i < input.length(); i++){
        for (int j = 0; j < vowelList.length; j++){
            if(Character.toUpperCase(input.charAt(i)) == vowelList[j]) {
                counter += 1;
            }
        }
    }
    System.out.println("we have " + counter + " characters");
    }
}
