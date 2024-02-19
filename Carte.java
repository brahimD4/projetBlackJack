package projetBlackJak1;

public class Carte {
   private Couleur couleurs;
   private Valeur valeurs;
   private boolean affiche;
  
   
public Carte(Couleur couleur, Valeur valeur) {
	this.couleurs = couleur;
	this.valeurs = valeur;
	this.affiche=true;
}


public Couleur getCouleurs() {
	return couleurs;
}
public void setCouleurs(Couleur couleur) {
	this.couleurs = couleur;
}

public Valeur getValeurs() {
	return valeurs;
}
public void setValeurs(Valeur valeur) {
	this.valeurs = valeur;
}

public boolean isAffiche() {
	return affiche;
}
public void setAffiche(boolean affiche) {
	this.affiche = affiche;
}


public void tourner() {
	 affiche=!affiche;
 } 


public void AfficheCarte() {
	if(affiche)
		System.out.printf("    "+valeurs.getNomval()+" || "+couleurs.getNomcol()+"          ");
	else
		System.out.printf("     cache");
	}
	
	
}
