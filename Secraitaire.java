
public class Secraitaire extends Personne{
	@Override
	public String toString() {
		return super.toString()+"salaire:" + salaire + "\nlabo:" + labo+"\n" ;
	}
	private double salaire ;
	private String labo;
	//getters and setters 
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String getLabo() {
		return labo;
	}
	public void setLabo(String labo) {
		this.labo = labo;
	}
	//Constructeur
	public Secraitaire(String nom,int annee,double salaire,String labo) {
		super(nom,annee);
		this.setLabo(labo);
		this.setSalaire(salaire);
				
	}
}
