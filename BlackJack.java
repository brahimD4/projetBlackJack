
package projetBlackJak1;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
	
		
  PaquetCartes paquet1=new PaquetCartes();
  paquet1.RemplirPaquet();
  paquet1.MelangerCartes();
  
  Main mainjoueur1=new Main();
  Main maincroupier=new Main();
  
  Joueur joueur1=new Joueur(mainjoueur1);
 Croupier croupier1=new Croupier(maincroupier);
 
croupier1.DistribuerLesCartes(paquet1, joueur1);






int RC;
int Rj;
do {
	RC= croupier1.VerifierResultcroupier(maincroupier);
	Rj=joueur1.VerifierResultJoueur(mainjoueur1);

	 croupier1.AfficheMainCroupier();
	 joueur1.AfficheMainJoueur();
	
	
	 System.out.println( "croupier= "+RC);
	 System.out.println( "joueur= "+Rj);
	 int choix=0;
	
		 
		 System.out.println("1:hit");
		 System.out.println("2:stand");
		 Scanner scan=new Scanner(System.in);
		 choix=scan.nextInt();
		 switch(choix) {
		 case 1:
			 if(Rj==1) {
			  joueur1.jRecoirCarte(paquet1); 
			 }
		 break;
		 case 2:
			  
			while(RC==1) {
				croupier1.cRecoirCarte(paquet1);
			   RC= croupier1.VerifierResultcroupier(maincroupier);
			}
			 break;
		 default:
			System.out.println("choisir 1 ou 2");
			 break;
		 
		 }
		 
		 Rj=joueur1.VerifierResultJoueur(mainjoueur1);
		RC= croupier1.VerifierResultcroupier(maincroupier);
    }while(Rj==1||RC==1);
     


   if((RC==2 ||Rj==3)&&(RC==1||Rj==3)) {
    System.out.println("khsrti");
    }
   

	//System.out.println("rb7ti");

 
      //croupier1.ResultFinal(RC,Rj,joueur1.mainJR.getNbCartes());

    
      
//System.out.println(joueur1.VerifierResult(croupier1)) ;

 //System.out.println(" total= "+joueur1.mainJR.getNbCartes());
 //System.out.println("Nombre de cartes= "+joueur1.mainJR.getValeurTotal());


 //croupier1.AfficheMainCR();

 
//  System.out.println("Affiche liste de cartes apres l joute");
  
 //paquet1.AffichelisteCartes();
 //System.out.println(paquet1.getNbCartes());
 //System.out.println(paquet1.getValeurTotal());

	}
	
}
