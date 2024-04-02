package core;

import interfaceGraphique.MainFmApplication;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.*;

public class Etudiant extends Contact {
    String Cycle;
    String Niveau;
    public Etudiant(String co, String no, String add, String ema, String tel, String datN, String cy, String n){
        super(co,no,add,ema,tel,datN);
        this.Cycle=cy;
        this.Niveau=n;
    }

    public String getCycle() {
        return Cycle;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setCycle(String cycle) {
        Cycle = cycle;
    }

    public void setNiveau(String niveau) {
        Niveau = niveau;
    }
    public void insertion(Connection connection){
        try {
            PreparedStatement pst1;
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/POO","root","Don_Pk2.0");
            pst1=(PreparedStatement)connection.prepareStatement("insert into etudiant() values(?,?,?,?,?,?,?,?)") ;
            pst1.setString(1,code);
            pst1.setString(2,nom);
            pst1.setString(3,DateDeNaissance);
            pst1.setString(4,address);
            pst1.setString(5,email);
            pst1.setString(6,telNumber);
            pst1.setString(7,Cycle);
            pst1.setString(8,Niveau);
            pst1.executeUpdate();
            pst1.close();
            System.out.println("ajout reussis dans la base de donnees");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
