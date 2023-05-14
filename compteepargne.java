package java_project;



// relation entre comptebanque et compteepargne avec EXTENDS pour que le compteepargne erite du comptebanque 
public class compteepargne extends comptebanque {
	
	// declaration du taux d'interet
	
	private double tauxinterets;
	
	
	//relation entre comptebanque et compteepargne avec taux d'interet en plus 
	
    public compteepargne(String numcompte, String proprietaire, double solde, double tauxinterets) {
		super(numcompte, proprietaire, solde);
		
		this.tauxinterets = tauxinterets;
	}
    
    
    // afficher le taux d interts ;
    
    public double afficherinteret() {
    	
    	System.out.println("le taux de vos interts est de "+tauxinterets+"%");
		return tauxinterets;
    }
    
    //afficher la somme des interets et ajoute cette derniere au solde 
    
    public double soldeinterets() {
    	
    	double interet=getsolde()*(tauxinterets/100);
    	
    	System.out.println("votre interets est "+interet+ "Euros");
    	
    	ajouter(interet);
    
    	return interet;
    }
    
    
    public double newinterets() {
		return tauxinterets;
    	
    	
    	
    }
}
