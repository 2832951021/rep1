package JavaSX;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Menu {
	public static void main(String[] args) {
		JFrame jf =new JFrame("���˼��");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setBounds(700,300,500,500);
		
		JPanel panel = new JPanel();
		
		JLabel jlabel = new JLabel("�û�����");
		JTextField t1 = new JTextField(8);
		panel.add(jlabel);
		panel.add(t1);
		
		JLabel jlabel2 = new JLabel("���룺");
		JPasswordField password = new JPasswordField(8);
		panel.add(jlabel2);
		panel.add(password);
		
		JLabel jlabel3 = new JLabel("�Ա�");
		JRadioButton male = new JRadioButton("��");
		JRadioButton female = new JRadioButton("Ů");
		ButtonGroup a =new ButtonGroup();
		a.add(male);
		a.add(female);
		male.setSelected(true);
		panel.add(jlabel3);
		panel.add(male);
		panel.add(female);
		
		JLabel jlabel4 = new JLabel("���ã�");
		JCheckBox b1 = new JCheckBox("�ܲ�");
		JCheckBox b2 = new JCheckBox("����Ϸ");
		JCheckBox b3 = new JCheckBox("��Ӿ");
		JCheckBox b4 = new JCheckBox("������");
		JCheckBox b5 = new JCheckBox("����");
		panel.add(jlabel4);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		
		JLabel jlabel5 = new JLabel("���ҽ��ܣ�");
		JTextArea area = new JTextArea(10,30);
		area.setLineWrap(true);
		panel.add(jlabel5);
		panel.add(area);
		
		JButton button = new JButton("�ύ");
		panel.add(button);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}

}
