package GestionTransactions;

import java.util.Date;

public class Echeance {

    private static int echId = 1;

    private int id;
    private Transaction transaction;
    private double montant;
    private Date dateEcheance;

    public int getId() {
        return id;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void enregistrerEcheance(Transaction transaction, double montant, Date dateEcheance) {
        this.transaction = transaction;
        this.montant = montant;
        this.dateEcheance = dateEcheance;
        id=echId;
        echId++;
    }

    public void modifierEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }
}