package swing;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class multicontador1A extends JFrame {

    multicontador1A(String[] args) {
        super("Contador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setPreferredSize(new Dimension(500, 500));
        //Color de fondo
        super.getContentPane().setBackground(Color.GRAY);

        // PRIMER CONTADOR
        JButton rest1 = new JButton("REST");
        JButton mas1 = new JButton("+");
        JTextArea text1 = new JTextArea();
        text1.setText("0");

        //AGRUPAR
        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.add(text1, BorderLayout.CENTER);
        panel1.add(rest1, BorderLayout.WEST);
        panel1.add(mas1, BorderLayout.EAST);    
        // CENTRAR PANEL
        contentPane.add(panel1, BorderLayout.CENTER);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // BORRAR 0
        text1.addFocusListener(new FocusListener() {

            @Override
            public void focusLost(FocusEvent e) {
                if (text1.getText().equals("")) {
                    text1.setText("0");
                }

            }

            @Override
            public void focusGained(FocusEvent e) {
                if (text1.getText().equals("0")) {
                    text1.setText("");
                }
            }

        });
      

        pack(); // debe ir después de agregar los componentes al panel
        setLocationRelativeTo(null); // debe ir después de pack()
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> new multicontador1A(args).setVisible(true));
    }

}
