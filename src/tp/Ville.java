package tp;

/**
 * @author luism
 *
 */
/**
 * @author luism
 *
 */
public class Ville {
	protected String nomVille;
	protected String nomPays;
	protected int nbHabitants;
	protected char categorie;
	
	public Ville(){
		System.out.println("Création d une ville");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbHabitants=0;
		this.setCategorie();
	}
	
	public Ville(String pNom , String vNom ,int pNbre ){
		System.out.println("Création d une ville avec les parametres");
		nomVille = vNom;
		nomPays  = pNom;
		nbHabitants = pNbre;
		this.setCategorie();
	}

	public String getNomVille() {
		return nomVille.toUpperCase();
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
		this.setCategorie();
	}
	public void setCategorie(){
		int bornesSuperieures[] = {0,100,1000,10000,500000,1000000,5000000,10000000};
		char categories[] = {'?','A','B','C','D','E','F','G','H'};
		
		int i = 0;
		while(i < bornesSuperieures.length && this.nbHabitants > bornesSuperieures[i] ){
			i++;
		}
		System.out.println("i :"+i);
		this.categorie = categories[i];
		
		
	}
	//comparer les tailles de villes
	public String comparer(Ville v1){
		String str = new String();
		
		if(v1.getNbHabitants() > this.getNbHabitants()){
			str = v1.getNomVille()+" est une ville plus grande que "+this.getNomVille();
		}
		else {
			str = this.getNomVille()+" est une ville plus peuple que "+this.getNomVille();
		}
		
		return str;
	}
	public String decrisToi(){
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+",elle comporte : "+this.nbHabitants+" habitant(s) => elle est donc de categorie "+this.categorie;
	}
	
}
