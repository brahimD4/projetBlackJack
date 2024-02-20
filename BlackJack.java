
package blackjack;

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
 

 
	Scanner scan =new Scanner(System.in);
    int choix=0;
do {
	System.out.println();
	System.out.println("-----------------------------------------Jeu BlackJack----------------------------------------------------------");
	System.out.println("                 1:Commencer le jeu");
	System.out.println();
	System.out.println("                 2:Consulter le Solde");
	System.out.println();
	System.out.println("                 3:Quiter le jeu");
	System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	System.out.printf("Votre choix= ");
	choix=scan.nextInt();
	}while(choix!=1&&choix!=2);
  
//Consulter le solde
if(choix==2) {
	System.out.println("votre solde = "+joueur1.getSolde());
	
}
      //commencer le jeu
     croupier1.DistribuerLesCartes(paquet1, joueur1);
	System.out.printf("la Mise =   ");
     int mise=scan.nextInt();
     //vierifier le solde
   int verifierMise=joueur1.verifirMise(mise);
     
do {
    if(choix==1&&verifierMise==2) {
  
    croupier1.AfficheMainCroupier();
    joueur1.AfficheMainJoueur();
    
  //choisir Hit or Stand
   	System.out.println("    1:Hit");
   	System.out.println("    2:Stand");
   	System.out.println(" Choix= ");
   	int choix1=scan.nextInt();
   	
  //si le joueur choisi Hit
   	if(choix1==1) {
   		joueur1.jRecoirCarte(paquet1);
   		
   	}else {
   	//si le joueur choisir Stand
   		if(choix1==2) {
   			
   	//le croupier recoit les cartes jusqua attendre 17
   		while(croupier1.mainCR.getValeurTotal()<17) {
   			croupier1.cRecoirCarte(paquet1);
   		}
   		
   	}else {
   		//si le joueur choisir ni hit ni Stand
   		System.out.println(" jourur choisir ni  Stand ni  Hit");
    }
   	}
   	}else {
		 System.out.println("Votre solde insuffisant");
		 break;
   	}
    
    //fin de commencer le jeu
    
    //Verifier les resultat 
    //si le coupier depasse 21 
    if( croupier1.mainCR.getValeurTotal()>21||(joueur1.mainJR.getValeurTotal()==21&&croupier1.mainCR.getValeurTotal()<21) ) {
    	 croupier1.AfficheMainCroupier();
    	    joueur1.AfficheMainJoueur();
    	 	 System.out.println(" ::::::::::::::::::::::::::::::::::");
     	    System.out.println("        Vous etes Ganez   ");
 	        System.out.println(" :::::::::::::::::::::::::::::::::::");
 	       joueur1.incrementSolde(mise);
    }else {
   	 
   	 //si le  joueur depasse 21
   	 if(joueur1.mainJR.getValeurTotal()>21||(croupier1.mainCR.getValeurTotal()==21&&joueur1.mainJR.getValeurTotal()<21)) {
   		 croupier1.AfficheMainCroupier();
   	    joueur1.AfficheMainJoueur();
	 	  System.out.println(" ::::::::::::::::::::::::::::::::::::");
  	      System.out.println("     Vous etes echoue     ");
	      System.out.println(" ::::::::::::::::::::::::::::::::::::");
	      joueur1.disincrementSolde(mise);
   	 }else {
   		 
   		 //si les deux main sont egaux
   		 if(croupier1.mainCR.getValeurTotal()==21&&joueur1.mainJR.getValeurTotal()==21
   				 &&(croupier1.mainCR.nbCartes==joueur1.mainJR.nbCartes)) {
   			 croupier1.AfficheMainCroupier();
   		    joueur1.AfficheMainJoueur();
   	 	 System.out.println(" ::::::::::::::::::::::::::::::::::::::");
  	     System.out.println("       vous etes egeaux       ");
	     System.out.println(" :::::::::::::::::::::::::::::::::::::::");
   		 }
   		 /*else {
   			 System.out.println(" 3awd 3mr");
   		 }*/
   			 
   	 }
    }
   
	
}while(croupier1.mainCR.getValeurTotal()<21&&joueur1.mainJR.getValeurTotal()<21);

     
     
	}//FIN de fonction principale main
	
}
