
public class Regulier extends Personne {
	@Override
	public String toString() {
		return super.toString()+"sectio:" + section + "\nmoyenne:" + moyenne+"\n";
	}

	private String section;
	private double moyenne;
	public static int etudiant=0;

	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
	public Regulier(String nom,int annee,String section,double moyenne) {
		super(nom,annee);
		this.setSection(section);
		this.setMoyenne(moyenne);
		etudiant++;
		
	}

}
