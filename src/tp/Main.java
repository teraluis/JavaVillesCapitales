/**
 * 
 */
package tp;

/**
 * @author luism
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville ville = new Ville();
		ville.setNomVille("la havane");
		ville.setNomPays("Cuba");
		ville.setNbHabitants(12000000);
		Ville marseille = new Ville("France","Marseille",850602);
		Ville rio = new Ville("Brazil","Rio",321654);
		
		System.out.println(marseille.decrisToi());
		System.out.println(rio.comparer(marseille));
		
		
	}

}
