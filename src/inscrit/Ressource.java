package inscrit;

public class Ressource {
 
	private int idR;

	private String document;
	private Candidat candidat;
	public Ressource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ressource(int idR, String document, Candidat candidat) {
		super();
		this.idR = idR;
		this.document = document;
		this.candidat = candidat;
	}
	public Ressource(String document, Candidat candidat) {
		super();
		this.document = document;
		this.candidat = candidat;
	}
	public int getIdR() {
		return idR;
	}
	public void setIdR(int idR) {
		this.idR = idR;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
}