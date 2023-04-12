package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MyApp implements Runnable {
	public void run() {
		JFrame frame = new JFrame("Mi primera aplicacion :D");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();
		contentPane.setPreferredSize(new Dimension(500, 500));
		contentPane.add(new JButton ("Pulsa aqui"), BorderLayout.NORTH);
		contentPane.add(new JTextField(), BorderLayout.CENTER);
		
		
		frame.pack();
		frame.setVisible(true);
	}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new MyApp());
    }
}


