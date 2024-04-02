package interfaceGraphique;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class CreationContact extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JButton validationButton1;
    private JButton annulerButton1;
    private JButton reinitialisationButton1;
    private JTextField saisie1;
    private JTextField saisie2;
    private JTextField saisie3;
    private JTextField saisie4;
    private JTextField saisie5;
    private JTextField saisie6;
    private JTextField saisie7;
    private JButton validationButton;
    private JButton annulerButton;
    private JButton reinitialisationButton;
    private JTextField saisieEN1;
    private JTextField saisieEN2;
    private JTextField saisieEN3;
    private JTextField saisieEN4;
    private JTextField saisieEN5;
    private JTextField saisieEN6;
    private JTextField saisieEN7;
    private JButton validationButton2;
    private JButton annulerButton2;
    private JButton reinitialisationButton2;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    private JTextField text5;
    private JTextField text6;
    private JTextField text7;
    private JTextField text8;
    private JTextField text9;
    private JTextField text10;
    private JTextField text11;
    private JLabel zone1;
    private JLabel zone2;
    private JLabel zone3;
    private JLabel zone4;
    private JLabel zone5;
    private JLabel zone6;
    private JLabel zone7;
    private JLabel zone8;
    private JTextField saisie8;

    public CreationContact() {
    setContentPane(panel1);
    setSize(600,400);


    validationButton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    annulerButton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int choix=JOptionPane.showConfirmDialog(null,"etes vous sur de quitter?");
            if(choix==JOptionPane.OK_OPTION){
                dispose();
            }
        }
    });
    annulerButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int choix=JOptionPane.showConfirmDialog(null,"etes vous sur de quitter?");
            if(choix==JOptionPane.OK_OPTION){
                dispose();
            }
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

    reinitialisationButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saisie1.setText(null);
            saisie2.setText(null);
            saisie3.setText(null);
            saisie4.setText(null);
            saisie5.setText(null);
            saisie6.setText(null);
            saisie7.setText(null);
        }
    });
    reinitialisationButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saisieEN1.setText(null);
            saisieEN2.setText(null);
            saisieEN3.setText(null);
            saisieEN4.setText(null);
            saisieEN5.setText(null);
            saisieEN6.setText(null);
            saisieEN7.setText(null);
        }
    });
    reinitialisationButton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            text1.setText(null);
            text2.setText(null);
            text3.setText(null);
            text4.setText(null);
            text5.setText(null);
            text6.setText(null);
            text7.setText(null);
            text8.setText(null);
            text9.setText(null);
            text10.setText(null);
            text11.setText(null);
        }
    });
    validationButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                MainFmApplication.Connect();
                PreparedStatement pst = MainFmApplication.pst;
                Connection connection=MainFmApplication.connection;
                pst=(PreparedStatement)connection.prepareStatement("insert etudiant() values (?,?,?,?,?,?,?,?)");
                pst.setString(1,saisie1.getText());
                pst.setString(2,saisie2.getText());
                pst.setString(3,saisie3.getText());
                pst.setString(4,saisie4.getText());
                pst.setString(5,saisie5.getText());
                pst.setString(6,saisie6.getText());
                pst.setString(7,saisie7.getText());
                pst.setString(8,saisie8.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"ajouter de ce contact effectue avec suscces");
                connection.close();
            }
            catch (Exception e1){
                e1.printStackTrace();
            }
        }
    });
        validationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    MainFmApplication.Connect();
                    PreparedStatement pst=MainFmApplication.pst;
                    Connection connection=MainFmApplication.connection;
                    pst=(PreparedStatement)connection.prepareStatement("insert into enseignant() values(?,?,?,?,?,?,?)");
                    pst.setString(1,saisieEN1.getText());
                    pst.setString(2,saisieEN2.getText());
                    pst.setString(3,saisieEN3.getText());
                    pst.setString(4,saisieEN4.getText());
                    pst.setString(5,saisieEN5.getText());
                    pst.setString(6,saisieEN6.getText());
                    pst.setString(7,saisieEN7.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"ajouter de ce contact effectue avec suscces");
                    connection.close();
                }
                catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        });
        validationButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PreparedStatement pst=MainFmApplication.pst;
                    Connection connection=MainFmApplication.connection;
                    pst=(PreparedStatement)connection.prepareStatement("insert into agent() values (?,?,?,?,?,?,?,?,?,?,?)");
                    pst.setString(1,text1.getText());
                    pst.setString(2,text2.getText());
                    pst.setString(3,text3.getText());
                    pst.setString(4,text4.getText());
                    pst.setString(5,text5.getText());
                    pst.setString(6,text6.getText());
                    pst.setString(7,text7.getText());
                    pst.setString(8,text8.getText());
                    pst.setString(9,text9.getText());
                    pst.setString(10,text10.getText());
                    pst.setString(11,text11.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"ajouter de ce contact effectue avec suscces");
                    connection.close();
                }
                catch (Exception e3){
                    e3.printStackTrace();
                }
            }
        });
    }
}
