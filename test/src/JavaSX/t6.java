package JavaSX;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class t6 {

		public static void main(String[] args) 
		{	
			JFrame j1 = new JFrame("Box");   //��������
			j1.setSize(200, 200);          //���ڴ�С
			JPanel j2 = new JPanel();       //�м�����
			
			JLabel l1 = new JLabel("��Ϸ��ȫ:");

			JComboBox<String> c1 = new JComboBox<String>();
			c1.addItem("-����-");
			c1.addItem("Ӣ������");
			c1.addItem("�����ȷ�");
			c1.addItem("��Խ����");
			c1.addItem("��������");
			
			j2.add(l1);
			j2.add(c1);
			
			j1.add(j2);	
			j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			j1.setVisible(true);
		}
	}
