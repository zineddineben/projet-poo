package GestionRendezVous;

import GestionClients.Client;
import GestionBiensImmobiliers.BienImmobilier;
import GestionBiensImmobiliers.AgentImmobilier;

import java.util.Date;

public interface IRendezVous {
    
    int getId();
    BienImmobilier getBien();
    Date getDate();
    Client getClient();
    AgentImmobilier getAgent();

    
    void planifierRendezVous(BienImmobilier bien, Date date, Client client, AgentImmobilier agent);
    void annulerRendezVous();
    void modifierDate(Date date);
    void reaffecterAgent(AgentImmobilier agent);
    void deplacerRendezVous(Date nouvelleDate);
    void notifierClient(String message);
    void notifierAgent(String message);
}

