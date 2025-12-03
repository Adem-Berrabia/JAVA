package app_poo;

public class Produit {
    private String reference;
    private String designation;
    public Produit(String reference, String designation) {
        this.reference = reference;
        this.designation = designation;
    }

    public String getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void afficher() {
        System.out.println("Référence: " + reference + ", Désignation: " + designation);
    }  


    
    

}