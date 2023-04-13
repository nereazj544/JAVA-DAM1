package swing;

import java.awt.*;

import javax.swing.*;

public class multicontador extends JFrame {
	multicontador(String[] args){
		super("Contador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		Container contentPane = getContentPane();
		contentPane.setPreferredSize(new Dimension(500, 500));
		
//		PRIMER CONTADOR
		JButton rest1 = new JButton("Rest");
		JButton más1 = new JButton("+");
		JLabel text1 = new JLabel("0");
		contentPane.add(new JTextArea(), BorderLayout.CENTER);
		contentPane.add(rest1, BorderLayout.WEST);
		contentPane.add(más1, BorderLayout.EAST);		
	}
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(() -> new multicontador(args).setVisible(true));
	}
}
