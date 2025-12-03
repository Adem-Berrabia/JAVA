
package ex3_TD_POO_HERITAGE;

//package com.colaps.gestion;

public class Profile {
    private int id;
    private String code;
    private String libelle;

    public Profile(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return libelle + " (" + code + ")";
    }
}
