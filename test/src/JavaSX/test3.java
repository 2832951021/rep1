package JavaSX;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class test3 {

	public static void main(String[] args) {
		JFrame jf = new JFrame("测试绝对布局");
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("文件");
		JMenu editMenu = new JMenu("编辑");
		JMenu viewMenu = new JMenu("视图");
		
		JMenuItem newItem = new JMenuItem("新建");
		JMenuItem openItem = new JMenuItem("打开");
		JMenuItem outItem = new JMenuItem("退出");
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(outItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(viewMenu);
		
		jf.setJMenuBar(menuBar);
		jf.setVisible(true);
		newItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("打开新建页面");
				jf.setVisible(false);
			}
		});
		
	}

}
