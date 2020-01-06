package inscrit;

public class Rapporter {
	private int idR;
	private These these;
	private Enseignant enseignant;
	public Rapporter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rapporter(These these, Enseignant enseignant) {
		super();
		this.these = these;
		this.enseignant = enseignant;
	}
	public Rapporter(int idR, These these, Enseignant enseignant) {
		super();
		this.idR = idR;
		this.these = these;
		this.enseignant = enseignant;
	}
	public int getIdR() {
		return idR;
	}
	public void setIdR(int idR) {
		this.idR = idR;
	}
	public These getThese() {
		return these;
	}
	public void setThese(These these) {
		this.these = these;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
		
	}
	public Rapporter(Enseignant enseignant) {
		super();
		this.enseignant = enseignant;
	}

	
	
	
}
