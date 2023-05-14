package java_project;

public class comptebanque {
	
		//declaration des attributs avec private pour proteger les informations du compte (ne pas rendre public)
	
	    private String numcompte;
	    private String proprietaire;
	    private double solde;

	    
	    //modilisation du  compte : 
	    
	    public comptebanque(String numcompte,String proprietaire,double solde){
	    	
	        this.numcompte=numcompte; 
	        this.proprietaire=proprietaire;
	        this.solde=solde;
	    }
	    
	    // methode pour recuperer les informations  du compte (
	    
	    public String getproprietaire(){
	        return proprietaire;
	    }
	    public String getnumcompte(){
	        return numcompte;
	    }
	    public double getsolde(){
	        return solde;
	    }
	    
	    
	    // methode pour afficher tous les attributs du compte (propietaire numcompte, solde):
	    
	    public String afficher(){
	        System.out.println("proprietaire du compte est Mr: "+proprietaire+" votre numero de compte est le : "+numcompte+"  votre solde est le : "+solde+" Euros");
			return null;
			
	    }
	    
	    // methode pour ajouter de l'argent au compte 
	    
	    public double ajouter(double mantant){
	    	
	        solde=solde+mantant;
	        System.out.println("votre nouveau solde est :"+solde+"euro");
			return mantant;
	    }
	    
	    // methode pour retirer de l'argent du compte 
	    
	    public double retirer(double mantant){
	        if(solde>mantant){
	            solde=solde-mantant;
	            System.out.println("votre nouveau solde est le :"+solde+"Euros");
	        }
	        else {
	            System.out.println("solde insufissant!");
	        }
			return mantant;
	    }
	   
	    
	  
	    
	    
	    

	    
	        
	     
	}



