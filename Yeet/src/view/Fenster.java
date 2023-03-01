package view;
import controll.ProgramController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame{
    private JPanel panel1;
    private JButton scannerButton;
    private JButton parserButton;
    private JTextField textField1;
    private JTextPane ausgabePTextPane;
    private JTextPane ausgabeTextPane;

    private ProgramController programController;
    public Fenster() {


        scannerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               // programController.scanner();
            }
        });
        parserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        setVisible(true);
        setContentPane(panel1);
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

