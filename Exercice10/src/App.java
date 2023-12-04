import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Ejercicio 10
        Eliminar los espacios de una frase pasada 
        por consola por el usuario.
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your message");
        String message = sc.nextLine();

        char[] messageArray = message.toCharArray();
        StringBuilder newMessage = new StringBuilder();

        for(int i = 0; i < messageArray.length; i++){
            if(messageArray[i] != ' '){
                newMessage.append(messageArray[i]);
            }
        }
        String result = newMessage.toString();

        System.out.println("new message: " + result);
    }
}
