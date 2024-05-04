package GestionTransactions;

import GestionBiensImmobiliers.BienImmobilier;
import GestionClients.Client;

import java.util.Date;

public class Transaction implements ITransactions {

    private static int trainId = 1;


    private int id;
    private BienImmobilier bien;
    private Client client;
    private String type;
    private double montant;
    private Date date;
    private Contrat contrat;

    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public BienImmobilier getBien() {
        return bien;
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getMontant() {
        return montant;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public Contrat getContrat() {
        return contrat;
    }

    
    @Override
    public void creerTransaction(BienImmobilier bien, Client client, String type, double montant, Date date) {
        this.bien = bien;
        this.client = client;
        this.type = type;
        this.montant = montant;
        this.date = date;
        id=trainId;
        trainId++;
    }

    @Override
    public void suivreTransaction() {
        
    }

    @Override
    public void ajouterContrat(Contrat contrat) {
        this.contrat = contrat;
    }
}
