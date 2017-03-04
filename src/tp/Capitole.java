package tp;

public class Capitole extends Ville {
	
	protected String monument;
	
	public Capitole() {
		super();
		monument = "aucun";
	}
	
	public String decrisToi(){
		String str = super.decrisToi()+"\n\t ==>>"+this.monument+" en est un monument";
		System.out.println("Invocation de super.decrisToi");
		
		return str;
	}
	
	public String getMonument(){
		return monument;
	}
	
	public void setMonument(String monument){
		this.monument= monument;
	}
	
	
}
