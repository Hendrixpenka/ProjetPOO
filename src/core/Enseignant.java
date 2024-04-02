package core;

import com.sun.tools.javac.Main;
import interfaceGraphique.MainFmApplication;

import java.sql.Connection;
import java.util.Date;
import java.sql.*;

public class Enseignant extends Contact{
    public String statut;
    public Enseignant(String co, String no, String add, String ema, String tel, String datN,String sta){
        super(co,no,add,ema,tel,datN);
        this.statut=sta;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    public void insertion(Connection c){
        try {
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/POO","root","Don_Pk2.0");
            PreparedStatement pst;
            pst=(PreparedStatement)c.prepareStatement("insert into enseignant() values (?,?,?,?,?,?,?)");
            pst.setString(1,code);
            pst.setString(2,nom);
            pst.setString(3,DateDeNaissance);
            pst.setString(4,address);
            pst.setString(5,email);
            pst.setString(6,telNumber);
            pst.setString(7,statut);
            System.out.println("insertion du contact dans la base de donnees reussis");
            pst.executeUpdate();
            c.close();
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
    }
}
