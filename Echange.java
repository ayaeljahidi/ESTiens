
public class Echange extends Regulier {
	@Override
	public String toString() {
		return super.toString()+"origine:" + origine+"\n";
	}

	private String origine;

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}
	
	public Echange(String nom,int annee,String section,double moyenne,String origine) {
		super(nom,annee,section,moyenne);
		this.setOrigine(origine);
	}

}
