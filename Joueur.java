package blackjack;

import java.util.Scanner;

public class Joueur  {
	
	  public Main mainJR ;
	   
	int solde;
	  
	  public Joueur(Main mainJR) {
			super();
			this.mainJR = mainJR;
			this.solde=100;
		}
	   
	   public void jRecoirCarte(PaquetCartes paquet) {
			mainJR.listCartes.add(paquet.listCartes.get(0));
			paquet.listCartes.remove(paquet.listCartes.get(0));
		
		}
	   
public void AfficheMainJoueur() {
	 System.out.println();
	 System.out.println(" ---------- Main de Joueur");
	 System.out.println();
	mainJR.AffichelisteCartes();
	 System.out.println();
	 System.out.println();
	 System.out.println(" ----->Valeur Total=  "+mainJR.getValeurTotal());
	 System.out.println();
	 System.out.println(" ----->Nombre de Cartes=  "+mainJR.getNbCartes());
	 System.out.println("******************************************************************************");
}


public int getSolde() {
	return solde;
}

public void incrementSolde(int sold) {
this.solde+=sold;

}
public void disincrementSolde(int sold) {
this.solde-=sold;

}
public int  verifirMise(int mise) {
	
	if(mise>solde) {
		//solde insufisante
		 return 1;
	}else
		return 2;
}
}
