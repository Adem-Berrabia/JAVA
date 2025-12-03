package ex3_TD_POO_HERITAGE;

//package com.colaps.gestion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Profils
        Profile CP  = new Profile(1, "CP", "Chef de projet");
        Profile MN  = new Profile(2, "MN", "Manager");
        Profile DP  = new Profile(3, "DP", "Directeur de projet");
        Profile DRH = new Profile(4, "DRH", "Directeur RH");
        Profile DG  = new Profile(5, "DG", "Directeur général");

        // Utilisateurs
        ArrayList<Utilisateur> users = new ArrayList<>();

        users.add(new Utilisateur("Ali", "Ben Salah", "ali@mail.com", "22222222", 2000,
                "ali", "1234", "IT", CP));

        users.add(new Utilisateur("Sami", "Zitoun", "sami@mail.com", "33333333", 2500,
                "sami", "pass", "IT", MN));

        users.add(new Utilisateur("Hatem", "Mansour", "hatem@mail.com", "44444444", 5000,
                "hatem", "admin", "Direction", DG));

        users.add(new Utilisateur("Mouna", "Karoui", "mouna@mail.com", "55555555", 3000,
                "mouna", "pwd", "RH", DRH));

        // Afficher les managers
        System.out.println("===== Liste des MANAGERS =====");
        for (Utilisateur u : users) {
            if (u.getProfile().getCode().equals("MN")) {
                u.affiche();
            }
        }
    }
}

