package ex2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
        Map<String, Integer> vehicules = new HashMap<String, Integer>();
        vehicules.put("BMW", 5);
        vehicules.put("Mercedes", 3);
        vehicules.put("Audi", 4);
        vehicules.put("Ford", 6);
        System.out.println("total des vehicules est " + vehicules.size());

        // On veut parcourir et afficher les clés de la hashMap
        Set<String> cles = vehicules.keySet();
        for (String cle : cles)
            System.out.println(cle);

        // On veut parcourir et afficher les valeurs de la hashMap
        Collection<Integer> valeurs = vehicules.values();
        for (int val : valeurs)
            System.out.println(" la valeur est : " + val);

        // On fait la recherche de la valeur de la clé "Audi"
        String searchKey = "Audi";
        if (vehicules.containsKey(searchKey))
            System.out.println("le total " + vehicules.get(searchKey) + " " + searchKey + " voitures!\n");

        // Effacer tous les valeurs de la hashMap
        vehicules.clear();
        System.out.println("apres l'operation clear , size: " + vehicules.size());
    }
}
