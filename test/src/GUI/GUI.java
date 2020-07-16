package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUI {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Login Example");
         frame.setSize(350, 200);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 
 JPanel panel = new JPanel();    
        frame.add(panel);
 
 placeComponents(panel);

         frame.setVisible(true);
}

private static void placeComponents(JPanel panel) {


 panel.setLayout(null);

        JLabel userLabel = new JLabel("’À∫≈£∫");
 
 userLabel.setBounds(10,20,80,25);
 panel.add(userLabel);


 JTextField userText = new JTextField(20);
 userText.setBounds(100,20,170,25);
 panel.add(userText);


 JLabel passwordLabel = new JLabel("√‹¬Î£∫");
 passwordLabel.setBounds(10,50,80,25);
 panel.add(passwordLabel);

 
 JPasswordField passwordText = new JPasswordField(20);
 passwordText.setBounds(100,50,170,25);
 panel.add(passwordText);

 
 JButton loginButton = new JButton("µ«¬º");
 loginButton.setBounds(100, 80, 80, 25);
 panel.add(loginButton);
 
 final JFrame jf = new JFrame("Ã· æ–≈œ¢");
 jf.setSize(400, 400);
 jf.setLocationRelativeTo(null);
 jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

         loginButton.addActionListener(new ActionListener(){
 	public void actionPerformed(ActionEvent a){
 		String name=userText.getText();
 		String pass=userText.getText();
 		String Name="molly";
 		String Pass="0724";
 		if(name.equals(Name)){
 			        			if(pass.toString().trim().equals(Pass)){
 				JOptionPane.showMessageDialog(jf, "µ«¬º≥…π¶");
 			}
 			else{
 				JOptionPane.showMessageDialog(jf, "√‹¬Î¥ÌŒÛ");
 			}
 		}else{
 			JOptionPane.showMessageDialog(jf, "’À∫≈¥ÌŒÛ");
 		}
 	}
 });
 

 JButton signoutButton = new JButton("ÕÀ≥ˆ");
 signoutButton.setBounds(190, 80 ,80,25);
 panel.add(signoutButton);
 
 
 signoutButton.addActionListener(new ActionListener(){
 	public void actionPerformed(ActionEvent a ){
 		System.exit(0);
 	}
 });

	}

}
