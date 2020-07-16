package GUI;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI3 {
	private static void createAndShowGUI() {
		JFrame Z=new JFrame("证件类型选择");
		Z.setLayout(new BorderLayout());
		Z.setSize(500,400);
		Z.setLocation(300,200);
		Z.setVisible(true);
		Z.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel=new JPanel();
		JComboBox<String>comboBox=new JComboBox<>();
		comboBox.addItem("请选择证件类型");
		comboBox.addItem("身份证");
		comboBox.addItem("警察证");
		comboBox.addItem("军官证");
		comboBox.addItem("护照");
		comboBox.addItem("香港居民身份证");
		comboBox.addItem("港澳通行证");
		JTextField textField=new JTextField(20);
		comboBox.addActionListener(e->{
			String item=(String) comboBox.getSelectedItem();
			if("请选择证件类型".equals(item)) {
				textField.setText("");
			}else {
				textField.setText("您选择的证件类型是:"+item);
			}
		});
		panel.add(comboBox);
		panel.add(textField);
		Z.add(panel,BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(GUI3::createAndShowGUI);

	}

}
