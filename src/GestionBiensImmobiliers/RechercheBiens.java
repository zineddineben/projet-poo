package GestionBiensImmobiliers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RechercheBiens {

    
    public List<BienImmobilier> rechercherBiens(Map<String, Object> criteria) {
        // Implementation to search for properties based on criteria
        // This method would typically interact with a database or a repository
        // to retrieve properties that match the specified criteria
        return null; 
    }

    // Method to filter properties by type
    public List<BienImmobilier> filtrerParType(List<BienImmobilier> biens, String type) {
        List<BienImmobilier> biensFiltres = new ArrayList<>();
        for (BienImmobilier bien : biens) {
            if (bien.getType().equals(type)) {
                biensFiltres.add(bien);
            }
        }
        return biensFiltres;
        
    }

    
    public List<BienImmobilier> filtrerParPrix(List<BienImmobilier> biens, double prixMin, double prixMax) {
        List<BienImmobilier> biensFiltres = new ArrayList<>();
    for (BienImmobilier bien : biens) {
        double prix = bien.getPrix();
        if (prix >= prixMin && prix <= prixMax) {
            biensFiltres.add(bien);
        }
    }
    return biensFiltres;
    }

    // Method to filter properties by location
    public List<BienImmobilier> filtrerParLocalisation(List<BienImmobilier> biens, String localisation) {
        List<BienImmobilier> biensFiltres = new ArrayList<>();
    for (BienImmobilier bien : biens) {
        if (bien.getLocalisation().equals(localisation)) {
            biensFiltres.add(bien);
        }
    }
    return biensFiltres;
    }

    // Method to filter properties by size range
    public List<BienImmobilier> filtrerParTaille(List<BienImmobilier> biens, double tailleMin, double tailleMax) {
        List<BienImmobilier> biensFiltres = new ArrayList<>();
    for (BienImmobilier bien : biens) {
        double taille = bien.getTaille();
        if (taille >= tailleMin && taille <= tailleMax) {
            biensFiltres.add(bien);
        }
    }
    return biensFiltres;
    }
}
