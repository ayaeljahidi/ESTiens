import java.util.ArrayList;;

public class Main {

	public static void main(String[] args) {
		ArrayList<Personne> estien = new ArrayList<Personne>();
		estien.add(new Secraitaire("najat tahiri",2005,5000.00,"LABSSIS"));
		estien.add(new Enseignant("abdellah moslih",1998,30000.00,"LABSSIS","S1PQ"));
		estien.add(new Regulier("mohamed nouri",2000,"S1GID",16.36));
		estien.add(new Regulier("aya el jahidi",2004,"S5GI",18.00));
		estien.add(new Echange("lamin lamin",2001,"GIM",15.36,"canada"));
		
		System.out.println("Parmi les "+estien.size()+" ESTiens,"+Regulier.etudiant+" sont des étudiants.\nliste des ESTiens:\n");
		for(Personne i : estien) {
			System.out.println(i.toString());
		}
		
		
	}

}
