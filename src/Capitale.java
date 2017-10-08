
public class Capitale extends Ville{
	private String monument;
	
	public Capitale(){
		super();
		String monument = "aucun";
	}
	//Constructeur 
	public Capitale (String nomVille, int hab, String nomPays, String monument){
		super(nomVille, hab, nomPays);
		this.monument = monument;
	}
	public String toString(){
		String str = super.toString() + "\n\t" + this.monument + " en est un monument";
		System.out.println("invocation de la méthode tosTringCapitale");
		return str;
	}
	public String GetMonumenet(){
		return monument;
	}
	public void SetMonumenet(String monument){
		this.monument = monument;
	}
}
