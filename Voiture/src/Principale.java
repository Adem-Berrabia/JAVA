
public class Principale {

	public static void main(String[] args) {
		Voiture v1= new Voiture();
		Voiture v2=new Voiture (8879,"Noir");
		Voiture v3=new Voiture (1154);
		v1.SetCouleur("rouge");
		v2.SetMatricule(45698);
		v3.SetPuissance(54);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
	}

	

}
