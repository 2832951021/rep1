package JavaSX;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class test1 {

	public static void main(String[] args) {
		JFrame jf =new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		
		String[] list = {"����","��������","���оŸ�","ȫְ����"};
		
		JComboBox<String> combobox =new JComboBox<>(list);
		
		combobox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				System.out.println(e.getStateChange());
				System.out.println(combobox.getSelectedIndex());
				System.out.println(combobox.getSelectedItem());
				
			}
		});
		combobox.setSelectedIndex(2);
		panel.add(combobox);
		jf.setContentPane(panel);
		jf.setVisible(true);
	}

}
