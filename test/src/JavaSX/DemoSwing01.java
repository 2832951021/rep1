package JavaSX;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DemoSwing01 {

	public static void main(String[] args) {
		//1创建 顶层窗口
		JFrame jf =new JFrame("测试窗口");
		
		//2设置
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//3中间容器
		JPanel panel = new JPanel();
		
		//4基本组件 按钮
		JButton button =new JButton("测试按钮");
		panel.add(button);
		
		//5把面板容器设置到窗口上
		jf.setContentPane(panel);
		
		//6展示
		jf.setVisible(true);
	}

}
