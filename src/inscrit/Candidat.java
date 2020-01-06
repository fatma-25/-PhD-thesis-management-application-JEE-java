package inscrit;

import java.sql.Date;

public class Candidat {
    private String idC ; 
    private String nom ; 
	private String prenom ; 
	private String dateNais;
	private int tel1 ; 
	private int tel2 ;
	private String email ; 
	private int num ;
	private String nationalite;
	private String niveau;
	private String lieu;
	private String genre;
	private String specialite;
	private String inscription ;
	private String photo;
	
	
	
	
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidat(String nom, String prenom, String dateNais, int tel1,
			int tel2, String email, int num, String nationalite, String niveau,
			String lieu, String genre, String specialite, String inscription,
			String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.email = email;
		this.num = num;
		this.nationalite = nationalite;
		this.niveau = niveau;
		this.lieu = lieu;
		this.genre = genre;
		this.specialite = specialite;
		this.inscription = inscription;
		this.photo = photo;
	}
	public Candidat(String idC, String nom, String prenom, String dateNais,
			int tel1, int tel2, String email, int num, String nationalite,
			String niveau, String lieu, String genre, String specialite,
			String inscription, String photo) {
		super();
		this.idC = idC;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.email = email;
		this.num = num;
		this.nationalite = nationalite;
		this.niveau = niveau;
		this.lieu = lieu;
		this.genre = genre;
		this.specialite = specialite;
		this.inscription = inscription;
		this.photo = photo;
	}
	public String getIdC() {
		return idC;
	}
	public void setIdC(String idC) {
		this.idC = idC;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNais() {
		return dateNais;
	}
	public void setDateNais(String dateNais) {
		this.dateNais = dateNais;
	}
	public int getTel1() {
		return tel1;
	}
	public void setTel1(int tel1) {
		this.tel1 = tel1;
	}
	public int getTel2() {
		return tel2;
	}
	public void setTel2(int tel2) {
		this.tel2 = tel2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getInscription() {
		return inscription;
	}
	public void setInscription(String inscription) {
		this.inscription = inscription;
	}
	public String getPhoto() {
		return photo;
	}
	public Candidat(String idC, String nom, String prenom, String dateNais,
			int tel1, int tel2, String email, int num, String nationalite,
			String niveau, String lieu, String genre, String specialite,
			String inscription) {
		super();
		this.idC = idC;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.email = email;
		this.num = num;
		this.nationalite = nationalite;
		this.niveau = niveau;
		this.lieu = lieu;
		this.genre = genre;
		this.specialite = specialite;
		this.inscription = inscription;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
}
	
	