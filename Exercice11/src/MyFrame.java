import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton upperButton;
    JButton lowerButton;
    String input;

    MyFrame() {
        
        upperButton = new JButton("to Upper Case");
        lowerButton = new JButton("to Lower Case");

        upperButton.addActionListener(this);
        lowerButton.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(150, 150);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);


        this.add(upperButton);
        this.add(lowerButton);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == upperButton) {
            input = JOptionPane.showInputDialog(null, "Enter your phrase", "Input", JOptionPane.QUESTION_MESSAGE);
            char[] inputCharacters = input.toCharArray();
            StringBuilder newMessage = new StringBuilder();
            for(int i = 0; i < inputCharacters.length; i++) {
                newMessage.append(Character.toUpperCase(inputCharacters[i]));
            } 
            String result = newMessage.toString();
            JOptionPane.showMessageDialog(null, result);
        }
        if(e.getSource() == lowerButton) {
            input = JOptionPane.showInputDialog(null, "Enter your phrase", "Input", JOptionPane.QUESTION_MESSAGE);
            char[] inputCharacters = input.toCharArray();
            StringBuilder newMessage = new StringBuilder();
            for(int i = 0; i < inputCharacters.length; i++) {
                newMessage.append(Character.toLowerCase(inputCharacters[i]));
            } 
            String result = newMessage.toString();
            JOptionPane.showMessageDialog(null, result);
        }
    }
    
}
