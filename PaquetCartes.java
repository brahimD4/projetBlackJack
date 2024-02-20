package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class PaquetCartes extends Main{
	
public PaquetCartes() {
		super();
		// TODO Auto-generated constructor stub
	}
public void RemplirPaquet() {
	
	for(Couleur col:Couleur.values()) {
	for(Valeur val:Valeur.values()) {
		Carte cart=new Carte(col, val);
		AjoutCarte(cart);
	}
	
	}
		
	}
public void MelangerCartes() {
	Collections.shuffle(listCartes);
}


}



