package GestionTransactions;

public class Contrat {
    
    private int id;
    private String type;
    private String details;

    private static int contId = 1;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDetails() {
        return details;
    }

    public void genererContrat(String type, String details) {
        this.type = type;
        this.details = details;
        this.id = contId;
        contId++;        
    }

    public void modifierContrat(String details) {
        this.details = details;
     }
}

