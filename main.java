package java_project;

public class main {

	private static String nana;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//nouveau compte (new compte):
		comptebanque newcompte = new comptebanque("12345","Bouali - khaled",5000);
		
		//afficher toutes les informations  du compte (appelle la methode afficher)
		
		newcompte.afficher();
		
		// ajouter une somme au compte (faire appelle a la methode ajouter);
		newcompte.ajouter(200);
		
		
		
		// deduire  une somme au compte (faire appelle a la methode ajouter) sachant que le solde est superieur au mantant ;
		newcompte.retirer(100);
		
		// deduire  une somme au compte (faire appelle a la methode ajouter) sachant que le solde est inferieur au mantant ;
		
		newcompte.retirer(6000);
		
	//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//nouveau compte epargne  (new compte epargne):
		
		compteepargne newcompteepargne= new compteepargne("1234567","KHALED",5000,10);
		
		//afficher toutes les informations du compteepargne (appelle la methode afficher)
		
		newcompteepargne.afficher();
		
		// Afficher le taux d'interet du salaier:
		
		newcompteepargne.afficherinteret();
		
		// afficher le solde avec interets:

		newcompteepargne.soldeinterets();
		
	///////////////////////////////////////////////////////////////////////////////////////////////
		
		//Creation d un nouveau salarié
		
		salariés newsalariés = new salariés (127,"khaled"," bouali","123456k9",4000);
		
		
		//	appeller la methode (afficherinformations) pour afficher les information du salarie 	
		
		newsalariés.afficherinformations();
		
		
		// appeller la methode (salaireannuel) pour calculer et afficher le salaire annuel 
		
		newsalariés.salaireannuel();
		
		
		//appeller la methode(setnom)  pour changer le nom
		
		newsalariés.setnom("nana");
		
		//appeller la methode (setprenom) pour changer le prenom
		
		newsalariés.setprenom("nini");
		
		//appeller la methode (augmentation) pour augmenter le salaire 
		
		newsalariés.augmentation(10);
		
		
		
		
		
		
				
	

	}

}
