package JavaSX;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DemoSwing01 {

	public static void main(String[] args) {
		//1���� ���㴰��
		JFrame jf =new JFrame("���Դ���");
		
		//2����
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//3�м�����
		JPanel panel = new JPanel();
		
		//4������� ��ť
		JButton button =new JButton("���԰�ť");
		panel.add(button);
		
		//5������������õ�������
		jf.setContentPane(panel);
		
		//6չʾ
		jf.setVisible(true);
	}

}
