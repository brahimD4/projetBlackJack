package projetBlackJak1;

import java.util.ArrayList;

public class Croupier {

public Main mainCR;
	
	
public Croupier(Main mainCR) {
		//super();
		this.mainCR = mainCR;
	}

public void cRecoirCarte(PaquetCartes paquet) {
// i=0;
		mainCR.listCartes.add(paquet.listCartes.get(0));
		paquet.listCartes.remove(paquet.listCartes.get(0));
			//paquet.listCartes.remove(i);
	}

public void AfficheMainCroupier() {
	 System.out.println();
	 System.out.println(" ---------- Main de Croupier-------------------------------------------------------");
	 System.out.println();
	mainCR.AffichelisteCartes();
	 System.out.println();
	/* boolean cache=false;
	 for(Carte cart: mainCR.listCartes) {
		 if(!cart.isAffiche()==false) {
			 cache=true;*/
	 System.out.println();
			 System.out.println(" ---->Valeur Total=  "+mainCR.getValeurTotal());
			 System.out.println(" ---->Nombre de Cartes=  "+mainCR.getNbCartes());
			 System.out.println("****************************************************************************");
		 }
	 
	
public void DistribuerLesCartes(PaquetCartes paquet, Joueur jouer1) {

for(int i=0;i<1;i++) {
		
		jouer1.jRecoirCarte(paquet);
		jouer1.jRecoirCarte(paquet);
	     paquet.listCartes.get(i+2).tourner();
		cRecoirCarte(paquet);
		cRecoirCarte(paquet);
		
}


}
public int VerifierResultcroupier(Main main) {
	int TC=main.getValeurTotal();
	
	if(TC<17) {
		//TC infirieur a 21
		return 1;
		
	}else {
		
		if(TC>=17&&TC<21) {
			//TC entre 17 et 21
			return 2;
			
		}else if(TC==21) {
			// croper rb7
				return 3;
				
			}else
		       //TC superieur a 21
		      return 4;
		}		
	}

public void ResultFinal(int VC,int VJ,int NbrJouer) {
	if(VC==2&& VJ==3||VC==1&&VJ==3) {
	     System.out.println("khsrti");
	}
	

}
}
	

