package GestionClients;

public class Preferences {
    
    private int id;
    private String type;
    private String details;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDetails() {
        return details;
    }

    public void ajouterDetail(String details) {
        this.details+= details;
    }

    public void modifierDetail(String details) {
        this.details= details;
    }
    
    public void supprimerDetail() {
        this.details=null;
    }
}
