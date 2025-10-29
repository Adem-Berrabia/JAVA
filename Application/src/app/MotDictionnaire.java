package app;

import java.util.Vector;
public class MotDictionnaire {

    // Attributes
    private String mot;         
    private String type;        
    private char genre;         
    private String definition; 
    private Vector ListeMots ;

    // Constructor
    public MotDictionnaire() {
        this.mot = "";
        this.type = "";
        this.genre = ' ';
        this.definition ="";
        ListeMots = new Vector();

    }
    public MotDictionnaire(String mot, String type, char genre, String definition) {
        this.mot = mot;
        this.type = type;
        this.genre = genre;
        this.definition = definition;
        ListeMots = new Vector();

    }
    public void Ajouter(String s) {
        ListeMots.add(s);
    }
    public int getNbMot() {
        return ListeMots.size();
    }
    public void Supprimer(String s) {
        if (!ListeMots.remove(s)) {
            System.out.println("Le mot n'existe pas dans le dictionnaire.");
        }
        else{
            System.out.println("Le mot a été supprimé avec succès.");
        }
    }
    public Boolean SupprimerTout(String s) {
        ListeMots.clear();
        return true;
    }
     public void premier() {
        if (!ListeMots.isEmpty()) {
            System.out.println( ListeMots.get(0));            
        }
        else {
            System.out.println("Le Liste est vide.");
        }

    }
     public void dernier() {
        if (!ListeMots.isEmpty()) {
            System.out.println(ListeMots.get(ListeMots.size() - 1));            
        }
        else {
            System.out.println("Le Liste est vide.");
        }
    }

    // Getters and Setters
    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    // Method to compare the word with a string
    public boolean egal(String s) {
        return this.mot.equals(s);
    }

    // toString method
    @Override
    public String toString() {
        return "mot = " + mot + ", type = " + type + ", genre = " + genre + ", definition = " + definition;
    }

    // Method to print the word details
    public void affiche() {
        System.out.println(toString());
    }
}
