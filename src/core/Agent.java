package core;

import com.sun.tools.javac.Main;
import interfaceGraphique.MainFmApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

public class Agent extends Contact {
    String salaire, statut, categorie, indiceDeSalaire, occupation;
    public Agent(String co, String no, String add, String ema, String tel, String datN, String sal, String sta,String cat,String idsal,String occu){
        super(co,no,add,ema,tel,datN);
        this.salaire=sal;
        this.statut=sta;
        this.categorie=cat;
        this.indiceDeSalaire=idsal;
        this.occupation=occu;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getSalaire() {
        return salaire;
    }

    public String getStatut() {
        return statut;
    }

    public String getIndiceDeSalaire() {
        return indiceDeSalaire;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setIndiceDeSalaire(String indiceDeSalaire) {
        this.indiceDeSalaire = indiceDeSalaire;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void insertion(Connection c1){
        try {
            PreparedStatement pst;
            c1= DriverManager.getConnection("jdbc:mysql://localhost:3306/POO","root","Don_Pk2.0");
            pst = (PreparedStatement) c1.prepareStatement("insert into agent() values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,code);
            pst.setString(2,nom);
            pst.setString(3,DateDeNaissance);
            pst.setString(4,address);
            pst.setString(5,email);
            pst.setString(6,telNumber);
            pst.setString(7,salaire);
            pst.setString(8,statut);
            pst.setString(9,categorie);
            pst.setString(10,indiceDeSalaire);
            pst.setString(11,occupation);
            pst.executeUpdate();
            System.out.println("insertion du contact dans la base de donnee reussis");
            pst.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
