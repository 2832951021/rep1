package JavaSX;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class test5 {

	public static void main(String[] args) {

		Font f =new Font("楷体",Font.BOLD,25);
		
		JFrame jf =new JFrame("个人简介");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setBounds(700,400,500,500);
		
		JPanel panel = new JPanel();
		
		JLabel jlabel = new JLabel("用户名：");
		JTextField t1 = new JTextField(8);
		panel.add(jlabel);
		panel.add(t1);
		
		JLabel jlabel2 = new JLabel("密码：");
		JPasswordField password = new JPasswordField(8);
		panel.add(jlabel2);
		panel.add(password);
		
		JLabel jlabel3 = new JLabel("性别：");
		JRadioButton male = new JRadioButton("男");
		JRadioButton female = new JRadioButton("女");
		ButtonGroup a =new ButtonGroup();
		a.add(male);
		a.add(female);
		male.setSelected(true);
		panel.add(jlabel3);
		panel.add(male);
		panel.add(female);
		
		JLabel jlabel4 = new JLabel("爱好：");
		JCheckBox b1 = new JCheckBox("跑步");
		JCheckBox b2 = new JCheckBox("玩游戏");
		JCheckBox b3 = new JCheckBox("游泳");
		JCheckBox b4 = new JCheckBox("看电视");
		JCheckBox b5 = new JCheckBox("跳舞");
		panel.add(jlabel4);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);

		JLabel education = new JLabel("学历:");
		JComboBox<String> c1 = new JComboBox<String>();
		c1.addItem("初中");
		c1.addItem("高中");
		c1.addItem("专科");
		c1.addItem("本科");
		c1.addItem("研究生");
		
		panel.add(education);
		panel.add(c1);
		
		jf.add(panel);	
		jf.setVisible(true);
		
		JLabel jlabel5 = new JLabel("自我介绍：");
		JTextArea area = new JTextArea(10,40);
		area.setLineWrap(true);
		panel.add(jlabel5);
		panel.add(area);
		
		JButton button = new JButton("注册");
		button.setBounds(120,330,330,50);
		button.setFont(f);
		panel.add(button);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}