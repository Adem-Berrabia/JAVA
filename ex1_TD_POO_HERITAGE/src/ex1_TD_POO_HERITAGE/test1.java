package ex1_TD_POO_HERITAGE;

public class test1 {
    public static void main(String[] args) {

        // Création d'un salarié
        Salarie s1 = new Salarie("Ali", 3, 1200);

        // Affichage
        System.out.println("=== Informations du salarié ===");
        System.out.println(s1.getInfo());
        System.out.println("Salaire : " + s1.getSalaire() + " DT");
        System.out.println("Prime : " + s1.getPrime() + " DT");
    }
}
