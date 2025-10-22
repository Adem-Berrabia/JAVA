
public class Voiture {

	private int matricule,puissance;
	public String couleur;
	public Voiture(int m,String c)
	{matricule=m;couleur=c;puissance=0;}
	public Voiture(int m)
	{this(m,"gris");}
	public Voiture()
	{this(0);}
	public Voiture(Voiture v) {
		matricule=v.matricule;
		puissance=v.puissance;
		
	} 
	public void nouvMatricule(int m)
	{matricule=m;}

	public void changerCouleur(String c)
	{couleur=c;}
	public String toString() {
		return "une voiture "+ matricule +" de couleur " + couleur +" de puissance "+ puissance; 
	}
	public void SetCouleur (String c) { 
		couleur =c;
	}
	public void SetMatricule (int m) { 
		matricule =m;
	}
	public void SetPuissance (int p) { 
		puissance =p;
	}
	public String getCouleur() {
		return couleur;
		}
	public int getMatricule() {
		return matricule;
	}
	public int getPuissance() {
		return puissance;
		}
	
}