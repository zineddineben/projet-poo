package GestionClients;

import java.util.List;

public interface IClient {
    int getId();
    String getNom();
    String getPrenom();
    String getEmail();
    String getTelephone();
    List<Interaction> getInteractions();
    List<Demande> getDemandes();
    List<Preferences> getPreferences();
    void ajouterInteractions(Interaction interaction);
    void ajouterDemande(Demande demande);
    void ajouterPreference(Preferences preference);
    void modifierClient(String nom, String prenom, String email, String telephone);
    void supprimerClient();
}
