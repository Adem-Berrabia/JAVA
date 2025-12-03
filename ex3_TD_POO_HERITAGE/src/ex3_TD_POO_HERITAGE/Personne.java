package ex3_TD_POO_HERITAGE;

//package com.colaps.gestion;

public class Personne {
    protected static int compteur = 1;

    protected int id;
    protected String nom;
    protected String prenom;
    protected String mail;
    protected String telephone;
    protected double salaire;

    public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
        this.id = compteur++;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public double calculerSalaire() {
        return salaire;
    }

    public void affiche() {
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Mail : " + mail);
        System.out.println("Téléphone : " + telephone);
        System.out.println("Salaire : " + calculerSalaire());
    }

    public double getSalaire() { return salaire; }
}
