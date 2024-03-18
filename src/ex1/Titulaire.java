package ex1;

import java.util.HashSet;

public class Titulaire {
	String nom;
	HashSet<Compte> SetCompte;

	Titulaire(String n) {
		nom = n;
		SetCompte = new HashSet<>();
	}

	public void ajouterCompte(Compte compte) {
		SetCompte.add(compte);
	}

	public void afficherComptes() {
		for (Compte compte : SetCompte) {
			System.out.println("Numéro de compte de titulaire : " + compte.numero);
		}
	}

	public void effectuerDepot(int numeroCompte, double montant) {
		for (Compte compte : SetCompte) {
			if (compte.numero == numeroCompte) {
				compte.depot(montant);
				System.out.println("Dépôt de " + montant + " effectué sur le compte " + numeroCompte);
				return;
			}
		}
		System.out.println("Compte avec le numéro " + numeroCompte + " non trouvé.");
	}

	public void effectuerRetrait(int numeroCompte, double montant) {
		for (Compte compte : SetCompte) {
			if (compte.numero == numeroCompte) {
				if (compte.solde >= montant) {
					compte.retrait(montant);
					System.out.println("Retrait de " + montant + " effectué sur le compte " + numeroCompte);
				} else {
					System.out.println("Solde insuffisant ");
				}
				return;
			}
		}
		System.out.println("Compte avec le numéro " + numeroCompte + " non trouvé.");
	}

	public int SoldeMax() {
		double soldeMax = Double.MIN_VALUE;
		int numeroCompte = -1;
		for (Compte compte : SetCompte) {
			if (compte.solde > soldeMax) {
				soldeMax = compte.solde;
				numeroCompte = compte.numero;
			}
		}
		return numeroCompte;
	}

}