package interfaceGraphique;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jtable extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTable table2;
    private  JTable table1;
    private JTable table3;
    private JButton sortie;
    private JButton quitter;
    private JButton sortieButton;

    public Jtable(){
        setContentPane(panel1);
        setSize(600,400);
        table();
        table1();
        table2();

        sortie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choix=JOptionPane.showConfirmDialog(null,"etes vous sur de quitter?");
                if(choix==JOptionPane.OK_OPTION){
                    dispose();
                }
            }
        });
        quitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choix=JOptionPane.showConfirmDialog(null,"etes vous sur de quitter?");
                if(choix==JOptionPane.OK_OPTION){
                    dispose();
                }
            }
        });
        sortieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choix=JOptionPane.showConfirmDialog(null,"etes vous sur de quitter?");
                if(choix==JOptionPane.OK_OPTION){
                    dispose();
                }
            }
        });
    }
    public  void table(){
        String[] Etudiant={"code","nom","DateDenaissance","adresse","email","telnumber","cycle","niveau"};
        String[] afficher=new String[8];
        DefaultTableModel model=new DefaultTableModel(null, Etudiant);
        try{
            MainFmApplication.Connect();
            Statement st=(Statement) MainFmApplication.connection.createStatement();
            ResultSet rs=st.executeQuery("select * from etudiant");
            while (rs.next()){
                afficher[0]=rs.getString("code");
                afficher[1]=rs.getString("nom");
                afficher[2]=rs.getString("date_naissance");
                afficher[3]=rs.getString("adresse");
                afficher[4]=rs.getString("email");
                afficher[5]=rs.getString("telnumber");
                afficher[6]=rs.getString("cycle");
                afficher[7]=rs.getString("niveau");
                model.addRow(afficher);
            }
            table1.setModel(model);
            MainFmApplication.connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public  void table1(){
        String[] Etudiant={"code","nom","DateDenaissance","adresse","email","telnumber","statut"};
        String[] afficher=new String[7];
        DefaultTableModel model=new DefaultTableModel(null, Etudiant);
        try{
            MainFmApplication.Connect();
            Statement st=(Statement) MainFmApplication.connection.createStatement();
            ResultSet rs=st.executeQuery("select * from enseignant");
            while (rs.next()){
                afficher[0]=rs.getString("code");
                afficher[1]=rs.getString("nom");
                afficher[2]=rs.getString("date_naissance");
                afficher[3]=rs.getString("adresse");
                afficher[4]=rs.getString("email");
                afficher[5]=rs.getString("telnumber");
                afficher[6]=rs.getString("statut");
                model.addRow(afficher);
            }
            table2.setModel(model);
            MainFmApplication.connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public  void table2(){
        String[] Etudiant={"code","nom","DateDenaissance","adresse","email","telnumber","salaire","statut","categorie","indice_salaire","occupation"};
        String[] afficher=new String[11];
        DefaultTableModel model=new DefaultTableModel(null, Etudiant);
        try{
            MainFmApplication.Connect();
            Statement st=(Statement) MainFmApplication.connection.createStatement();
            ResultSet rs=st.executeQuery("select * from agent");
            while (rs.next()){
                afficher[0]=rs.getString("code");
                afficher[1]=rs.getString("nom");
                afficher[2]=rs.getString("date_naissance");
                afficher[3]=rs.getString("adresse");
                afficher[4]=rs.getString("email");
                afficher[5]=rs.getString("telnumber");
                afficher[6]=rs.getString("salaire");
                afficher[7]=rs.getString("statut");
                afficher[8]=rs.getString("categorie");
                afficher[9]=rs.getString("indice_salaire");
                afficher[10]=rs.getString("occupation");
                model.addRow(afficher);
            }
            table3.setModel(model);
            MainFmApplication.connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
