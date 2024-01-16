package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Personne {
    String nom;
    String clientID;
    String adresse;

    public Personne(String nom, String clientID, String adresse) {
        this.nom = nom;
        this.clientID = clientID;
        this.adresse = adresse;
    }
}

class Data {
    String nom;
    String adresse;
    int taux; // 25 ou 50

    public Data(String nom, String adresse, int taux) {
        this.nom = nom;
        this.adresse = adresse;
        this.taux = taux;
    }
}

public class ChainHotel {

    public static List<Data> genererBonsReduction(Map<String, Personne> mapParis, Map<String, Personne> mapLondres, Map<String, Personne> mapAmsterdam) {
        List<Data> bonsReduction = new ArrayList<>();

        for (Map.Entry<String, Personne> entry : mapParis.entrySet()) {
            String clientID = entry.getKey();
            Personne paris = entry.getValue();
            Personne londres = mapLondres.get(clientID);
            Personne amsterdam = mapAmsterdam.get(clientID);

            if (londres != null && amsterdam != null) {
                // Le client a séjourné dans les 3 hôtels, taux de réduction 50%
                bonsReduction.add(new Data(paris.nom, paris.adresse, 50));
            } else if (londres != null || amsterdam != null) {
                // Le client a séjourné dans 2 hôtels parmi les 3, taux de réduction 25%
                bonsReduction.add(new Data(paris.nom, paris.adresse, 25));
            }
        }

        return bonsReduction;
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        Map<String, Personne> mapParis = new HashMap<>();
        Map<String, Personne> mapLondres = new HashMap<>();
        Map<String, Personne> mapAmsterdam = new HashMap<>();

        // Remplir les maps avec des données de clients (à adapter selon vos besoins)
        mapParis.put("ID1", new Personne("Client1", "ID1", "Adresse1"));
        mapParis.put("ID2", new Personne("Client2", "ID2", "Adresse2"));

        mapLondres.put("ID1", new Personne("Client1", "ID1", "Adresse1"));
        mapLondres.put("ID3", new Personne("Client3", "ID3", "Adresse3"));

        mapAmsterdam.put("ID1", new Personne("Client1", "ID1", "Adresse1"));
        mapAmsterdam.put("ID4", new Personne("Client4", "ID4", "Adresse4"));

        // Appeler la méthode pour générer les bons de réduction
        List<Data> bonsReduction = genererBonsReduction(mapParis, mapLondres, mapAmsterdam);

        // Afficher les résultats
        for (Data bon : bonsReduction) {
            System.out.println("Nom: " + bon.nom + ", Adresse: " + bon.adresse + ", Taux de réduction: " + bon.taux + "%");
        }
    }
}
