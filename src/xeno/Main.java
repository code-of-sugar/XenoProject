package xeno;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame xeno = xenoFrameOpen(600, 400);
		Container c = xeno.getContentPane();
		xenoTitleScreen(xeno);
		xenoTitleText(xeno, c);
		xeno.setVisible(true);
	}

	public static JFrame xenoFrameOpen(int height, int width) {
	    JFrame frame = new JFrame("Xeno");
	    frame.setSize(height, width);
	    frame.setLocation(100, 100);
	    return frame;
	}
	
	public static void xenoTitleScreen(JFrame xeno) {
		JLabel background = new JLabel(new ImageIcon("./img/startback.jpg"));
		xeno.add(background);
	}
	
	public static void xenoTitleText(JFrame xeno, Container c) {
		JLabel label = new JLabel("XENO");
		JPanel panel = new JPanel();
		panel.add(label);
		c.add(panel, BorderLayout.CENTER);
	}
}
