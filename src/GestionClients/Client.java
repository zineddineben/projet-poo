package GestionClients;
import java.util.List;

public class Client implements IClient {
    
    private static int clientId=1;

    private int id;
    private String nom;
    private String username;
    private String password;
    private String prenom;
    private String email;
    private String telephone;
    private List<Interaction> interactions;
    private List<Demande> demandes;
    private List<Preferences> preferences;
  
    public void ajouterClient(String nom, String prenom,String username, String password, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password=password;
        this.email = email;
        this.telephone = telephone;
        id=clientId;
        clientId++;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }
    public String getusername() {
		// TODO Auto-generated method stub
		return username;
	}
    public String getpassword() {
    	return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    @Override
    public List<Interaction> getInteractions() {
        return interactions;
    }

    @Override
    public List<Demande> getDemandes() {
        return demandes;
    }

    @Override
    public List<Preferences> getPreferences() {
        return preferences;
    }

    @Override
    public void ajouterInteractions(Interaction interaction) {
       this.interactions.add(interaction);
    }

    @Override
    public void ajouterDemande(Demande demande) {
        this.demandes.add(demande);

    }

    @Override
    public void ajouterPreference(Preferences preference) {
        this.preferences.add(preference);

    }

    @Override
    public void modifierClient(String nom, String prenom, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    @Override
    public void supprimerClient() {
        interactions.clear();
        demandes.clear();
        preferences.clear();
        nom = null;
        prenom = null;
        email = null;
        telephone = null;
        id=0;
     
    }

	
    

}
