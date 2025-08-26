
public class Enseignant extends Secraitaire {
	@Override
	public String toString() {
		return super.toString()+"section:" + section+"\n";
	}


	private String section;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	
	public Enseignant(String nom,int annee,double salaire,String labo,String section) {
		super(nom,annee,salaire,labo);
		this.setSection(section);
	}

}
