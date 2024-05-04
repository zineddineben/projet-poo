package GestionTransactions;

import GestionBiensImmobiliers.BienImmobilier;
import GestionClients.Client;

import java.util.Date;

public interface ITransactions {
    int getId();
    BienImmobilier getBien();
    Client getClient();
    String getType();
    double getMontant();
    Date getDate();
    Contrat getContrat();
    void creerTransaction(BienImmobilier bien, Client client, String type, double montant, Date date);
    void suivreTransaction();
    void ajouterContrat(Contrat contrat);
}

