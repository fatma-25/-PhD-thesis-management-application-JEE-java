package inscrit;

import java.util.List;


public interface Gestionecoledoctorale {
	public void addCandidat(Candidat c); 
	public void updateCandidat(Candidat c); 
	public void delete(String code);
	public Candidat  getCondidatByIdC(String idC);
	public List<Candidat>  getAllCondidat();
	
	
	public int verifExistanceCandidat(String id);
	public int getThesesoutenuByThese(int these);
	public int getThesedeposeByThese1(int these);
	
	public void updateUtilisateur(Utilisateur u); 
	public Utilisateur  getUtilisateurtById(int id);
    
	public void addEncadreur(Encadrement e);
	public List<Encadrement> getAllEncadrement();
	public int getLastThese();// select Max(id_these) from these ; 
	public int getLastThesedepose();
	
	public Encadrement getEncadreurByThese(int idEn); 
	public Juger getEnseignantByJuger(int id);
	
	public These getTheseById(int id_these);
	public Thesedepose getThesedeposeByThese(int id); 
	public void addThese(These t); 
	public void updateThese(These t); 
	public List<These>  getAllThese();
	
	public List<Rapporter> getAllRapporteurByThese(int id); 
	
	
	public void addRessource(Ressource r);
	public List<Ressource> getAllRessource();
	public void delete2(int code);
	
	public void addObservation(Observation ob);
	public void updateObservation(Observation ob); 
	
	public void addJugement(Juger ju);
	public void updateJugement(Juger ju); 
	
	
	
	
	public Utilisateur verifUtilisateur(String login, String password);
	public List<Utilisateur>  getAllUtilisateur();
	
	

	public void addEnseignant(Enseignant e); 
	public void updateEnseignant(Enseignant e); 
	public void delete1(int pass);
	public Enseignant  getEnseignantById(int id);
	
	public List<Enseignant> getAllEnseignant();
	
	
	
	
	
	
	public void addThesedepose(Thesedepose t); 
	public void updateThesedepose(Thesedepose t); 
    public Thesedepose  getThesedeposeByid(int id);
	public List<Observation>  getAllThesedepose();

	
	
	public void addThesesoutenu(Thesesoutenu s); 
	public void updateThesesoutenu(Thesesoutenu s); 
    public Thesesoutenu  getThesesoutenuByid(int idD);
	public List<Thesesoutenu>  getAllThesesoutenu();
	
	
	public void addRapporteur(Rapporter r);
	
	
}
