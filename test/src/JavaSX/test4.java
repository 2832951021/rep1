package JavaSX;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class test4 {

	Font d =new Font("楷体",Font.BOLD,42);
	Font f =new Font("楷体",Font.BOLD,25);

	JFrame loginui = new JFrame("用户登录页面");
	JLabel system = new JLabel("仓库管理系统");
	JLabel usernamela = new JLabel("用户名:");
	JLabel passwordla = new JLabel("密码:");
	JLabel usertypela = new JLabel("角色:");

	JTextField username = new JTextField();
	JPasswordField password = new JPasswordField();
	JComboBox<String> usertype = new JComboBox<>(new String[] {"管理员","超级管理员"});
	JButton login = new JButton("登录");

	private void loginUi(){

	loginui.setBounds(1200,120,650,500);

	loginui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	loginui.setVisible(true);

	loginui.setLayout(null);

	system.setBounds(150,80,300,40);
	system.setFont(d);

	usernamela.setBounds(120,150,100,30);
	usernamela.setFont(f);

	passwordla.setBounds(120,210,100,30);
	passwordla.setFont(f);

	usertypela.setBounds(120,270,100,30);
	usertypela.setFont(f);
	
	username.setBounds(250,150,200,30);
	username.setFont(f);
	password.setBounds(250,210,200,30);
	password.setFont(f);
	usertype.setBounds(250,270,200,30);
	usertype.setFont(f);

	login.setBounds(120,330,330,50);
	login.setFont(f);
	
	loginui.add(system);
	loginui.add(usernamela);
	loginui.add(passwordla);
	loginui.add(usertypela);
	loginui.add(username);
	loginui.add(password);
	loginui.add(usertype);
	loginui.add(login);

	usertype.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println("1112312312");
		}
	});
}
	public static void main(String[] args) {
		test4 t =new test4();
		t.loginUi();

	}
}
