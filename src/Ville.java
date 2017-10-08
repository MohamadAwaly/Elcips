
public class Ville{
	
  protected  String nomVille;
  protected String nomPays;
  protected int nbreHabitants; 
  protected char categorie;
  public static int nbreInstances;
  protected static int nbreInstanceBis;
 
  // Constructeur par défaut
  public Ville(){
	  // incrementer la variable a chaque appel du constructeur
	  nbreInstances++;
	  nbreInstanceBis++;
	  System.out.println("Création d'une ville");
	  nomVille = "Inconnue";
	  nomPays = "Inconnue";
	  nbreHabitants = 0;
	  this.setCategorie();
  }
  public Ville(String pNom, int pNbre, String pPays)
  
  {
	  nbreInstances++;
	  nbreInstanceBis++;
	  System.out.println("Création d'une ville avec des paramètre");
	  nomVille = pNom;
	  nomPays = pPays;
	  nbreHabitants = pNbre;
	  this.setCategorie();
  }
  //*************   ACCESSEURS *************
public String getNomVille() {
	return nomVille;
}
//*************   MUTATEURS   *************
public void setNomVille(String nomVille) {
	this.nomVille = nomVille;
}

public String getNomPays() {
	return nomPays;
}

public void setNomPays(String nomPays) {
	this.nomPays = nomPays;
}

public int getNbreHabitants() {
	return nbreHabitants;
}

public void setNbreHabitants(int nbre) {
	this.nbreHabitants = nbre;
	this.setCategorie();
}
public char getCategorie(){
	return categorie;
}
public static int getNombreInstancesBis(){
	return nbreInstanceBis;
}
public void setCategorie(){
    int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    int i = 0;
    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
      i++;

    this.categorie = categories[i];
}
public String toString() {
    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+
    		" habitant(s) => elle est donc de catégorie : "+this.categorie;
  
}
public String comparer(Ville v1){
	String str = new String();
	
	if (v1.getNbreHabitants() > this.nbreHabitants)
		str = v1.getNomVille()+" est une ville plus peuple que " + this.nomVille;
	else
		str = this.nomVille + " est une ville plus peuple que " + v1.getNomVille();
	
	return str;
	
}


}
