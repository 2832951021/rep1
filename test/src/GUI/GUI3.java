package GUI;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI3 {
	private static void createAndShowGUI() {
		JFrame Z=new JFrame("֤������ѡ��");
		Z.setLayout(new BorderLayout());
		Z.setSize(500,400);
		Z.setLocation(300,200);
		Z.setVisible(true);
		Z.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel=new JPanel();
		JComboBox<String>comboBox=new JComboBox<>();
		comboBox.addItem("��ѡ��֤������");
		comboBox.addItem("���֤");
		comboBox.addItem("����֤");
		comboBox.addItem("����֤");
		comboBox.addItem("����");
		comboBox.addItem("��۾������֤");
		comboBox.addItem("�۰�ͨ��֤");
		JTextField textField=new JTextField(20);
		comboBox.addActionListener(e->{
			String item=(String) comboBox.getSelectedItem();
			if("��ѡ��֤������".equals(item)) {
				textField.setText("");
			}else {
				textField.setText("��ѡ���֤��������:"+item);
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
