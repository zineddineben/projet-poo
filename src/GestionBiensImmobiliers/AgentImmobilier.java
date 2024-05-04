package GestionBiensImmobiliers;

import java.util.List;

public class AgentImmobilier {
    
    

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private List<BienImmobilier> biens; 

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }


    public String getTelephone() {
        return telephone;
    }

    public void ajouterBien(BienImmobilier bien){
        this.biens.add(bien);

    }
    public void modifierBien(BienImmobilier bien){
        for(BienImmobilier b : biens){
            if(b.getId() == bien.getId()){
                b = bien; 
                return;
            }
        }
    }
    public void supprimerBien(int id){
        for(BienImmobilier bien : biens){
            if(bien.getId() == id){
                biens.remove(bien); 
                return;
            }
        }
        
    }

    public void affecterBien(BienImmobilier bien){

    }
 
}

