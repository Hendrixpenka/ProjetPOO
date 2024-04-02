package core;

import java.util.ArrayList;
import java.util.Date;

public class Repertoire {
    public ArrayList<Contact> contacts;

    public Repertoire(ArrayList<Contact> c){
        this.contacts=c;
    }
    public void ajouterContact(Contact c){
        contacts.add(c);
    }
    public void supprimerContact(Contact c){//on considere a la base que c'est index mais si on veut preciser plus tard que c'est un object on doit caster ca en string ou en integer
        contacts.remove(c);
    }
    public void ModifierContact(Contact c){

    }
    public void rechercherContact(Contact c){
        for (Contact contact : contacts) {
            if (contact.equals(c)) {
                System.out.println("le contact a ete trouve");
            }
            else {
                System.out.println("le contact n'a pas ete trouve");
            }
        }
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
}