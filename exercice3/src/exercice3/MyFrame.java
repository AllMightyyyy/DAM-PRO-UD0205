package exercice3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    JButton inputMore;
    JButton sumaDePositivos;
    JButton sumaDeNegativos;
    JButton sumaDePares;
    JButton sumaDeImpares;
    JButton cantidadDePositivos;
    JButton cantidadDeNegativos;
    JButton cantidadDePares;
    JButton cantidadDeImpares;
    JButton mediaDeTodos;
    ArrayList<Integer> intArrayList;
    int initialInput;

    MyFrame() {
        intArrayList = new ArrayList<>();
        initialInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number", "Advanced Calculator", JOptionPane.INFORMATION_MESSAGE));
        inputMore = new JButton("I want to input more");
        sumaDePositivos = new JButton("Suma de Positivos");
        sumaDeNegativos = new JButton("Suma de Negativos");
        sumaDePares = new JButton("Suma de Pares");
        sumaDeImpares = new JButton("Suma de Impares");
        cantidadDePositivos = new JButton("Cantidad De Positivos");
        cantidadDeNegativos = new JButton("Cantidad de Negativos");
        cantidadDePares = new JButton("Cantidad de Pares");
        cantidadDeImpares = new JButton("Cantidad de Impares");
        mediaDeTodos = new JButton("Media de Todos");

        inputMore.addActionListener(this);
        sumaDePositivos.addActionListener(this);
        sumaDeNegativos.addActionListener(this);
        sumaDePares.addActionListener(this);
        sumaDeImpares.addActionListener(this);
        cantidadDePositivos.addActionListener(this);
        cantidadDeNegativos.addActionListener(this);
        cantidadDePares.addActionListener(this);
        cantidadDeImpares.addActionListener(this);
        mediaDeTodos.addActionListener(this);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));
        
        buttonPanel.add(inputMore);
        buttonPanel.add(sumaDePositivos);
        buttonPanel.add(sumaDeNegativos);
        buttonPanel.add(sumaDePares);
        buttonPanel.add(sumaDeImpares);
        buttonPanel.add(cantidadDePositivos);
        buttonPanel.add(cantidadDeNegativos);
        buttonPanel.add(cantidadDePares);
        buttonPanel.add(cantidadDeImpares);
        buttonPanel.add(mediaDeTodos);
        
        this.add(buttonPanel);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == inputMore) {
	        int numberOfDesiredInputs = Integer.parseInt(JOptionPane.showInputDialog(null, "How Many More Inputs you want", "Advanced Calculator", JOptionPane.INFORMATION_MESSAGE));
	        for (int i = 0; i < numberOfDesiredInputs; i++) {
	            int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number", "Advanced Calculator", JOptionPane.INFORMATION_MESSAGE));
	            intArrayList.add(input);
	        }
	    } else if (e.getSource() == sumaDePositivos) {
	        int suma = 0;
	        if (initialInput >= 0) {
	            suma += initialInput;
	        }
	        for (int i = 0; i < intArrayList.size(); i++) {
	            if (intArrayList.get(i) >= 0) {
	                suma += intArrayList.get(i);
	            }
	        }
	        JOptionPane.showMessageDialog(null, "The sum of all positive numbers is : " + suma);
	    } else if (e.getSource() == sumaDeNegativos) {
	        int suma = 0;
	        if (initialInput <= 0) {
	            suma += initialInput;
	        }
	        for (int i = 0; i < intArrayList.size(); i++) {
	            if (intArrayList.get(i) <= 0) {
	                suma += intArrayList.get(i);
	            }
	        }
	        JOptionPane.showMessageDialog(null, "The sum of all negative numbers is : " + suma);
	    }
	    else if(e.getSource()==sumaDePares) {
			int suma = 0;
			if((initialInput % 2) == 0) {
				suma += initialInput;
			}
			for (int i=0; i < intArrayList.size(); i++) {
				if((intArrayList.get(i) % 2) == 0) {
					suma += intArrayList.get(i);
				}
			}
			JOptionPane.showMessageDialog(null, "The sum of all pair numbers is : " + suma);
		}
	    else if(e.getSource()==sumaDeImpares) {
			int suma = 0;
			if((initialInput % 2) != 0) {
				suma += initialInput;
			}
			for(int i = 0; i < intArrayList.size(); i++) {
				if((intArrayList.get(i) % 2) != 0) {
					suma += intArrayList.get(i);
				}
			}
			JOptionPane.showMessageDialog(null, "The sum of all impair numbers is : " + suma);
		}
	    else if(e.getSource()==cantidadDePositivos) {
			int cantidad = 0;
			if(initialInput >= 0) {
				cantidad ++;
			}
			for(int i = 0; i < intArrayList.size(); i++) {
				if(intArrayList.get(i) >= 0) {
					cantidad++;
				}
			}
			JOptionPane.showMessageDialog(null, "The quantity of all positive numbers is : " + cantidad);
	    } else if (e.getSource() == cantidadDeNegativos) {
	        int cantidad = 0;
	        if (initialInput <= 0) {
	            cantidad++;  // Increment the count if the initial input is negative
	        }
	        for (int i = 0; i < intArrayList.size(); i++) {
	            if (intArrayList.get(i) <= 0) {
	                cantidad++;  // Increment the count for negative numbers from the list
	            }
	        }
	        JOptionPane.showMessageDialog(null, "The quantity of all negative numbers is : " + cantidad);
	    } else if (e.getSource() == cantidadDePares) {
	        int cantidad = 0;
	        if (initialInput % 2 == 0) {
	            cantidad++;  // Increment the count if the initial input is even
	        }
	        for (int i = 0; i < intArrayList.size(); i++) {
	            if (intArrayList.get(i) % 2 == 0) {
	                cantidad++;  // Increment the count for even numbers from the list
	            }
	        }
	        JOptionPane.showMessageDialog(null, "The quantity of all pair numbers is : " + cantidad);
	    } else if (e.getSource() == cantidadDeImpares) {
	        int cantidad = 0;
	        if (initialInput % 2 != 0) {
	            cantidad++;  // Increment the count if the initial input is odd
	        }
	        for (int i = 0; i < intArrayList.size(); i++) {
	            if (intArrayList.get(i) % 2 != 0) {
	                cantidad++;  // Increment the count for odd numbers from the list
	            }
	        }
	        JOptionPane.showMessageDialog(null, "The quantity of all impair numbers is : " + cantidad);
	    } else if (e.getSource() == mediaDeTodos) {
	        int suma = initialInput;
	        int cantidadDeTodo = 1;
	        for (int i = 0; i < intArrayList.size(); i++) {
	            suma += intArrayList.get(i);
	            cantidadDeTodo++;
	        }
	        double media = (double) suma / cantidadDeTodo;
	        JOptionPane.showMessageDialog(null, "The medium of all numbers is : " + media);
	    }
	}
}