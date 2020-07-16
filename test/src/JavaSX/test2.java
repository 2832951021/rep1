package JavaSX;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class test2 {

	public static void main(String[] args) {
		JFrame jf = new JFrame("²âÊÔ¾ø¶Ô²¼¾Ö");
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(null);
		
		JButton button = new JButton("lyf1");
		button.setLocation(50,50);
		button.setSize(100,50);
		
		JButton button2 = new JButton("lyf2");
		button2.setLocation(50,100);
		button2.setSize(100,50);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
		
		JButton button3 = new JButton("lyf3");
		button3.setBounds(panel.getWidth()-100,panel.getHeight()-50,100,50);
		System.out.println(panel.getWidth());
		
		panel.add(button);
		panel.add(button2);
		panel.add(button3);

	}

}
