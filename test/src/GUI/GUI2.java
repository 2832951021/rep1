package GUI;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUI2 {
	private static final int PAGE_END = 0;
	private static void createAndShowGUI() {
		JFrame z=new JFrame("设置字体");
		z.setLayout(new BorderLayout());
		z.setSize(350,350);
		z.setLocation(350,250);
		z.setVisible(true);
		z.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JLabel label=new JLabel("中华人民共和国万岁",JLabel.CENTER);
		label.setFont(new Font("黑体",Font.PLAIN,20));
		JPanel panel=new JPanel();
		JCheckBox italic=new JCheckBox("斜体");
		JCheckBox bold=new JCheckBox("粗体");
		ActionListener listener=new ActionListener(){
			public void actionPerformed(ActionEvent a) {
				int mode=0;
				if(bold.isSelected())
					mode+=Font.BOLD;
				if(italic.isSelected())
					mode+=Font.ITALIC;
				label.setFont(new Font("黑体",mode,20));			
			}
		};
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		panel.add(italic);
		panel.add(bold);
		z.add(label);
		z.add(panel,BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(GUI2::createAndShowGUI);

	}

}
