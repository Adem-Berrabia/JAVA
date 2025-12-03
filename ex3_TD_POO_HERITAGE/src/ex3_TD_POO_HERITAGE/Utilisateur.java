package ex3_TD_POO_HERITAGE;

//package com.colaps.gestion;

public class Utilisateur extends Personne {
    private String login;
    private String password;
    private String service;
    private Profile profile;

    public Utilisateur(String nom, String prenom, String mail, String telephone, double salaire,
                       String login, String password, String service, Profile profile) {

        super(nom, prenom, mail, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
        this.profile = profile;
    }

    @Override
    public double calculerSalaire() {
        switch (profile.getCode()) {
            case "MN":
                return salaire * 1.10;   // +10%
            case "DG":
                return salaire * 1.40;   // +40%
            default:
                return salaire;
        }
    }

    @Override
    public void affiche() {
        System.out.println("=== Utilisateur ===");
        super.affiche();
        System.out.println("Login : " + login);
        System.out.println("Service : " + service);
        System.out.println("Profil : " + profile);
        System.out.println("------------------");
    }

    public Profile getProfile() {
        return profile;
    }
}
