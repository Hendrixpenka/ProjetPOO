package interfaceGraphique;
import core.Etudiant;

import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFmApplication extends JFrame{
    private JPanel principal1;
    private JPanel principal2;
    private JPanel principal3;
    private JButton creation;
    private JButton annulerButton;
    private JButton affichage;
    private JPanel principal4;
    public static Connection connection;
    public static PreparedStatement pst;
    ResultSet rs;
public MainFmApplication() {

    creation.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CreationContact creationContact=new CreationContact();
            creationContact.setVisible(true);
        }
    });
    affichage.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Jtable jtable=new Jtable();
            jtable.setVisible(true);
        }
    });
    annulerButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int choix=JOptionPane.showConfirmDialog(null,"etes vous sur de quitter?");
            if(choix==JOptionPane.OK_OPTION){
                dispose();
            }
        }
    });
    Connect();
}
public static void Connect() {
    try {
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/POO", "root", "Don_Pk2.0");
    } catch (Exception e) {
        e.printStackTrace();

    }
}


public static  void main(String[] args)
{
    MainFmApplication mainFmApplication=new MainFmApplication();
    mainFmApplication.setContentPane(mainFmApplication.principal1);
    mainFmApplication.setVisible(true);
    mainFmApplication.setSize(600,400);
    mainFmApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
