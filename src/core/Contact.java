package core;

import java.sql.Connection;
import java.util.Date;

public  abstract class Contact {
    public String code, nom,address, email,telNumber;
    public String DateDeNaissance;
    public Contact(String C,String N,String A,String E,String T,String D){
        this.code=C;
        this.nom=N;
        this.address=A;
        this.email=E;
        this.telNumber=T;
        this.DateDeNaissance=D;
    }
    public String getDateDeNaissance() {
        return DateDeNaissance;
    }

    public String getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        DateDeNaissance = dateDeNaissance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public abstract void insertion(Connection connection);
}
