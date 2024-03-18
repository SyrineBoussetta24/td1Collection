package ex1;

public class main {
    public static void main(String[] args) {

    	Banque banque = new Banque("B1");

        Titulaire titulaire1 = new Titulaire("AA");
        Titulaire titulaire2 = new Titulaire("CC");

        banque.creerCompte(titulaire1, 100);
        banque.creerCompte(titulaire1, 200);
        banque.creerCompte(titulaire2, 350);

        System.out.println("Comptes de la banque avant le tri:");
        banque.affiche();

        banque.trierComptes();

        System.out.println("\nComptes de la banque après le tri:");
        banque.affiche();

        titulaire1.afficherComptes();
        titulaire2.afficherComptes();

        

        titulaire1.effectuerDepot(100, 500);
        titulaire1.effectuerRetrait(200, 200);

        System.out.println("\nComptes de chaque titulaire après les opérations:");
        titulaire1.afficherComptes();
        titulaire2.afficherComptes();
    }
}
