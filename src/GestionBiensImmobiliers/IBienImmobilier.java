package GestionBiensImmobiliers;

public interface IBienImmobilier {
    int getId(); 
    
    String getType() ;

    double getTaille ();

    double getPrix();

    String getLocalisation(); 

    String getDescription();

    AgentImmobilier getAgent();

    void setType( String type);

    void setTaille( Double taille);

    void setPrix( double prix);

    void setLocalisation( String localisation);

    void setDescription( String description);

    void setAgent( AgentImmobilier agent);

    void ajouterDescription(String description);

    void modifierBien( BienImmobilier bien);

    void supprimerBien();
 
}
