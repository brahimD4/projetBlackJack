package projetBlackJak1;

import java.util.Scanner;

public class Joueur  {
	
	  public Main mainJR ;
	   
	   /*public Joueur(Main mainJR){
		this. mainJR.listCartes=;
		this.mainJR.nbCartes=0;
		this.mainJR.nom="";
		this.mainJR.valeurTotal=0;
	   }*/
	  
	  public Joueur(Main mainJR) {
			super();
			this.mainJR = mainJR;
		}
	   
	   public void jRecoirCarte(PaquetCartes paquet) {
		  // int i=0;
		   for(int i=0;i<1;i++) {
			mainJR.listCartes.add(paquet.listCartes.get(i));
			paquet.listCartes.remove(paquet.listCartes.get(i));
			   
		   }
			
			//mainJR.AffichelisteCartes();
		    //paquet.listCartes.remove(cart);
		}
	   


/*public void RecoirCarte(Carte cart,Main mainJR) {
			mainJR.listCartes.add(cart);
		}
	*/
public void AfficheMainJoueur() {
	 System.out.println();
	 System.out.println(" ---------- Main de Joueur---------------------------------------------------------");
	 System.out.println();
	mainJR.AffichelisteCartes();
	 System.out.println();
	 System.out.println();
	 System.out.println(" ----->Valeur Total=  "+mainJR.getValeurTotal());
	 System.out.println(" ----->Nombre de Cartes=  "+mainJR.getNbCartes());
	// System.out.println();
	 System.out.println("******************************************************************************");
}


public int VerifierResultJoueur(Main main) {
	//boolean result=false;
	int T=main.getValeurTotal();
	if(T<21) {
		//stand or hit
          return 1;
	}else{
	    	if(T==21){
	    		// rb7 
	    		return 2;
	         }else if(T>21) {
	        	 // khsrti
	        	return 3;
	         }else
	        	 // Acunn
	    	 return 4;
	}

}



}
