
public class Personne {
	public String toString() {
		return getClass().getName()+"\nnom:" + nom + "\nannee:" + annee+"\n";
	}
	
	private String nom;
	private int annee;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public Personne(String nom,int annee) {
		this.setNom(nom);
		this.setAnnee(annee);
	}
}
