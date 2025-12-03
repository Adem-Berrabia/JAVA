package app_poo;

public class Prix {
    private double prixHT;
    private double tva;

    public Prix(double prixHT, double tva) {
        this.prixHT = prixHT;
        this.tva = tva;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public double getTva() {
        return tva;
    }

    public double getPrixTTCO() {
        return prixHT * (1 + tva / 100);
    }

    public void afficher() {
        System.out.println("Prix HT: " + prixHT + ", TVA: " + tva + "%, Prix TTC: " + getPrixTTCO());
    }
}
