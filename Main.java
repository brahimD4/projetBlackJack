package projetBlackJak1;

import java.util.ArrayList;

public class Main {
	public  String nom;
	public int valeurTotal;
	protected int nbCartes;
	public ArrayList<Carte> listCartes =new ArrayList<>();
	
	public Main() {
	}

	public void AjoutCarte(Carte carte) {
		listCartes.add(carte);
	}
	
	
	public void AffichelisteCartes() {
		for(Carte cart:listCartes){
				cart.AfficheCarte();

		}
			
	}
	
	public int getValeurTotal() {
		valeurTotal=0;
		for(Carte cart:listCartes){
			valeurTotal=valeurTotal+cart.getValeurs().getValeur();
		}
		return valeurTotal;
	}

	public int getNbCartes() {
		return listCartes.size();
	}
	
	
}

