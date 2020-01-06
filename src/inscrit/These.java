package inscrit;

public class These {
	private int id_these;
	private String titre;
	private String description;
	private Candidat candidat;
	
	public These() {
		super();
		// TODO Auto-generated constructor stub
	}

	public These(int id_these, String titre, String description,
			Candidat candidat) {
		super();
		this.id_these = id_these;
		this.titre = titre;
		this.description = description;
		this.candidat = candidat;
	}

	public These(String titre, String description, Candidat candidat) {
		super();
		this.titre = titre;
		this.description = description;
		this.candidat = candidat;
	}

	public int getId_these() {
		return id_these;
	}

	public void setId_these(int id_these) {
		this.id_these = id_these;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	
	

}
