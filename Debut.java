import java.util.*;
public abstract class Debut {
	
	protected Joueur plusJeune(LinkedList<Joueur> listJoueur) {
		Joueur jeune = null;
		if (listJoueur.size()>0) {
			jeune=listJoueur.get(0);
			for (int i = 1 ; i<listJoueur.size();i++) {
				if (listJoueur.get(i).age<jeune.age) {
					jeune = listJoueur.get(i);
				}
			}
		}return jeune;
	}
	protected abstract Joueur doubleLePlusGrand();
	
	protected abstract Joueur PiocheEleve();
	
}
