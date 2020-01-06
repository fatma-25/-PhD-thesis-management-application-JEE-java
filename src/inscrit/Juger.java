package inscrit;

public class Juger {

	private int idJ ;
	private Enseignant enseignant;
	private These these;
	
	
	public Juger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Juger(int idJ, Enseignant enseignant, These these) {
		super();
		this.idJ = idJ;
		this.enseignant = enseignant;
		this.these = these;
	}
	public Juger(Enseignant enseignant, These these) {
		super();
		this.enseignant = enseignant;
		this.these = these;
	}
	public int getIdJ() {
		return idJ;
	}
	public void setIdJ(int idJ) {
		this.idJ = idJ;
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
