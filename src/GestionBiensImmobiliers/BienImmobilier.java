package GestionBiensImmobiliers;


public class BienImmobilier implements IBienImmobilier {

    private int id ;
    private String type; 
    private double taille; 
    private double prix ; 
    private String localisation ; 
    private String description ; 
    private AgentImmobilier agent ;

    @Override 
     public  int getId() {
        return id ;
    }
    @Override 
    public String getType(){
        return type; 
    }
    @Override 
    public double getTaille(){
        return taille;
    }
    @Override 
    public double getPrix(){
        return prix;
    }

    @Override
    public String getLocalisation() {
        return localisation ;
    }
    @Override
    public String getDescription() {
       return description ;
    }
    @Override
    public AgentImmobilier getAgent() {
       return agent;
    }
    @Override
    public void setType(String type) {
       this.type = type ;
    }
    @Override
    public void setTaille(Double taille) {
        this.taille = taille; 
    }
    @Override
    public void setPrix(double prix) {
        this.prix =prix ;
    }
    @Override
    public void setLocalisation(String localisation) {
        this.localisation=localisation;
    }
    @Override
    public void setDescription(String description) {
       this.description= description;
    }
    @Override
    public void setAgent(AgentImmobilier agent) {
       this.agent=agent;
    }
    @Override
    public void ajouterDescription (String description) {
      this.description += description; 
       }

    @Override
    public void modifierBien(BienImmobilier bien) {
        this.type = bien.getType();
        this.taille = bien.getTaille();
        this.prix = bien.getPrix();
        this.localisation = bien.getLocalisation();
        this.description = bien.getDescription();
        this.agent = bien.getAgent();
      
    }
    @Override
    public void supprimerBien() {
        this.type = null;
        this.taille = 0.0;
        this.prix = 0.0;
        this.localisation = null;
        this.description = null;
        this.agent = null;
      
    }

    
}
