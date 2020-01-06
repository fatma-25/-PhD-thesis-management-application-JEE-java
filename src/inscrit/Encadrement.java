package inscrit;

public class Encadrement {
	private int idEn;
	private Enseignant enseignant;
	private These these;
	public Encadrement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Encadrement(Enseignant enseignant, These these) {
		super();
		this.enseignant = enseignant;
		this.these = these;
	}
	public Encadrement(int idEn, Enseignant enseignant, These these) {
		super();
		this.idEn = idEn;
		this.enseignant = enseignant;
		this.these = these;
	}
	public int getIdEn() {
		return idEn;
	}
	public void setIdEn(int idEn) {
		this.idEn = idEn;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public These getThese() {
		return these;
	}
	public void setThese(These these) {
		this.these = these;
	}
	
	

}
