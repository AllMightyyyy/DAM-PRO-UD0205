package exercice1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton signInButton;
    JButton exitButton;
    HashMap<String, String> logInInfo;
    
    MyFrame() {
        
        signInButton = new JButton("Sign In");
        exitButton = new JButton("Exit");
        logInInfo = new HashMap<String, String>();

        logInInfo.put("zakaria", "123");
        logInInfo.put("luis", "1234");
        logInInfo.put("Paco", "2727");
        
        signInButton.addActionListener(this);
        exitButton.addActionListener(this);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);

       
       
        this.add(exitButton);
        this.add(signInButton);
        this.setLayout(new FlowLayout());
        
        this.pack();
        this.setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signInButton) {
            String userName = JOptionPane.showInputDialog(null, "Enter your User Name", "Sign In", JOptionPane.INFORMATION_MESSAGE);
            String passWord = JOptionPane.showInputDialog(null, "Enter your password", "Sign In", JOptionPane.INFORMATION_MESSAGE);

            passWordChecker(userName, passWord, logInInfo);
        }
        if(e.getSource()==exitButton) {
            System.out.println("SEE YOU NEXT TIME");
            System.exit(0);
        }
    }

    public void passWordChecker(String userName, String password, HashMap<String, String> logInInfo) {
        for(int i = 0; i <= userName.length(); i++ ) {
        	if(logInInfo.get(userName).equals(password) ) {
        		//if it returns a Key then userName exists
        		//if it returns 0 then the userName doesnt exist
        		JOptionPane.showMessageDialog(null, "Congratulations");
        		break;
        	} else {
        		for(int i1 = 0; i1 <= 2; i1++) {
        			int numberOfTriesLeft = 2 - i1++;
        			JOptionPane.showMessageDialog(null, "Wrong PassWord or UserName");
        			JOptionPane.showMessageDialog(null, "You have " + numberOfTriesLeft + " more tries");
        			userName = JOptionPane.showInputDialog(null, "Enter your User Name", "Sign In", JOptionPane.INFORMATION_MESSAGE);
                    password = JOptionPane.showInputDialog(null, "Enter your password", "Sign In", JOptionPane.INFORMATION_MESSAGE);
                    if(logInInfo.get(userName).equals(password) ) {
                		//if it returns a Key then userName exists
                		//if it returns 0 then the userName doesnt exist
                		JOptionPane.showMessageDialog(null, "Congratulations");
        		}
                    continue;
        	}
        }
    }
    }
}
    

