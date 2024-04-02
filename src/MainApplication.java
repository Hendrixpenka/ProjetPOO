import core.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainApplication {
    static Connection connection;
    PreparedStatement pst;

    public static void main(String[] args) throws SQLException {
        Etudiant E=new Etudiant("21p050","Singhe Penka Hendrix","Yaounde","hendrixpenka2@gmail.com","677961717","02/07/2005","ingenieur","3");
        Enseignant En=new Enseignant("21E050","Don_PK","yaounde","penkasinghe05@gmail.com","682645280","02/07/1997","vacataire");
        Etudiant E1=new Etudiant("21p275","Sibefeu chimba carlos","douala","sibefeu@gmail.com","695001080","30/07/1984","licence","5");
        Agent A1=new Agent("21p030","simo Toto","yaounde,mendong","sorelsimo@gmail.com","657443280","02/07/2003","120000 fcfa","agent d'entretien","toilette","E1y191","etudiant");
        ArrayList<Contact> contact= new ArrayList<Contact>();
        contact.add(E);
        contact.add(En);
        contact.add(E1);
        Repertoire R1=new Repertoire(contact);
        for (Contact c: contact){
            System.out.println("les elements sont: "+c.nom);
        }
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/POO","root","Don_Pk2.0");
        //E.insertion(connection);
        En.insertion(connection);
        //A1.insertion(connection);


    }
}