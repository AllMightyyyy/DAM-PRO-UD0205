import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        
        
        Ejercicio 4 :
         Pide por teclado el nombre, edad y salario y muestra el salario.
        –	Si es menor de 16 no tiene edad para trabajar
        –	Entre 19 y 50 años el salario es un 5 por ciento más
        –	Entre 51 y 60 años el salario es un 10 por ciento más
        –	Si es mayor de 60 el salario es un 15 por ciento más

        */

        String name = JOptionPane.showInputDialog(null, "Enter your name : ", "Enter Your Information", JOptionPane.QUESTION_MESSAGE);
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age : ", "Enter Your Information", JOptionPane.QUESTION_MESSAGE));
        double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your salary : ", "Enter Your Information", JOptionPane.QUESTION_MESSAGE));

        if(age < 18) {
            JOptionPane.showMessageDialog(null, name + " You aren't able to work");
        } 
        else if((age <= 50) && (age >= 18)) {
            salary = salary + ((salary * 5)/100);
            JOptionPane.showMessageDialog(null, name + " Your salary is increased by 5% and it becomes : " + salary, "Congrats",JOptionPane.INFORMATION_MESSAGE);
        }
        else if((age >= 51)&&(age <= 60)){
            salary = salary + ((salary * 10)/100);
            JOptionPane.showMessageDialog(null, name + " Your salary is increased by 10% and it becomes : " + salary, "Congrats",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (age >= 61) {
            salary = salary + ((salary * 15)/100);
            JOptionPane.showMessageDialog(null, name + " Your salary is increased by 15% and it becomes : " + salary, "Congrats",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
