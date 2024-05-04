package GestionRendezVous;

import GestionBiensImmobiliers.AgentImmobilier;
import GestionBiensImmobiliers.BienImmobilier;
import GestionClients.Client;

import java.util.Date;

public class RendezVous implements IRendezVous {
    
    private static int rendId = 1;

    private int id;
    private BienImmobilier bien;
    private Date date;
    private Client client;
    private AgentImmobilier agent;

    
    public int getId() {
        return id;
    }

    public BienImmobilier getBien() {
        return bien;
    }

    public Date getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public AgentImmobilier getAgent() {
        return agent;
    }

    
    @Override
    public void planifierRendezVous(BienImmobilier bien, Date date, Client client, AgentImmobilier agent) {
        this.bien = bien;
        this.date = date;
        this.client = client;
        this.agent = agent;
        id=rendId;
        rendId++;
    }

    @Override
    public void annulerRendezVous() {
        this.id=0;
        this.bien=null;
        this.date=null;
        this.client=null;
        this.agent=null;

    }

    @Override
    public void modifierDate(Date date) {
        this.date = date;
    }

    @Override
    public void reaffecterAgent(AgentImmobilier agent) {
        this.agent = agent;
    }

    @Override
    public void deplacerRendezVous(Date nouvelleDate) {
        this.date = nouvelleDate;;
    }

    @Override
    public void notifierClient(String message) {
       
    }

    @Override
    public void notifierAgent(String message) {
       
    }
}
