package exercice2;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		/*
		 * Crea una aplicación que nos pida un día de la semana 
		 * y que nos diga si es un día laboral o no. 
		 * Usa un switch para ello.
		 * 
		 */
		String input = JOptionPane.showInputDialog(null, "Enter What day a week day");
		isAWorkDay(input);
		
	}
		public static void isAWorkDay(String input) {
			switch(input.toUpperCase()) {
					case "MONDAY":
					case "TUESDAY":
					case "WEDNESDAY":
					case "THURSDAY":
					case "FRIDAY":
							JOptionPane.showMessageDialog(null, "THIS IS A WORK DAY", "IS this a workday ?", JOptionPane.WARNING_MESSAGE);
							break;
					case "SATURDAY":
					case "SUNDAY":
							JOptionPane.showMessageDialog(null, "It s not a work DAY HURRRAAAAAAH", "Is this a workday", JOptionPane.INFORMATION_MESSAGE);
					
			}
		}

}
