package ex1;

import java.util.ArrayList;

public class Banque {

	String nom;
	ArrayList<Compte> ListCompte;

	Banque(String n) {
		ListCompte = new ArrayList<>();
		nom = n;
	}

	public void creerCompte(Titulaire titulaire, int numeroCompte) {
		Compte compte = new Compte(numeroCompte);
		ListCompte.add(compte);
		titulaire.ajouterCompte(compte);
	}

	public void affiche() {
		for (Compte compte : ListCompte) {
			System.out.println("Numéro de compte: " + compte.numero);
		}
	}
	void trierComptes() {
        ListCompte.sort(new SoldeComparator());
    }
}