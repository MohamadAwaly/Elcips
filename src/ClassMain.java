
public class ClassMain {

	public static void main(String[] args) {
		Ville tableau[] = new Ville[6];
		
		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		
		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		
		for (int i = 0; i < 6; i++)
		{
			if (i<3){
				Ville v = new Ville(tab[i], tab2[i],"France");
				tableau[i]=v;
			}
			else{
				Capitale c = new Capitale(tab[i], tab2[i], "france", " la tour Eifel");
				tableau[i]=c;
			}
		}
		for (Ville v : tableau){
			System.out.println(v.toString());
		}
		
		

	}

}
