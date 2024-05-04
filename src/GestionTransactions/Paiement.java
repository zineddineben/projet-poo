package GestionTransactions;

import java.util.Date;

public class Paiement {
   
    private static int paiId = 1;

    private int id;
    private Transaction transaction;
    private double montant;
    private Date date;
  
    public int getId() {
        return id;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }

    
    public void enregistrerPaiement(Transaction transaction, double montant, Date date) {
        this.transaction = transaction;
        this.montant = montant;
        this.date = date;
        id=paiId;
        paiId++;
    }

    public void annulerPaiement() {
        this.transaction = null;
        this.montant = 0;          
        this.date = null; 
        id=0;  
    }
}
