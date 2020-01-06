package inscrit;

public class Thesesoutenu {
	
	private String date;
	private String mention;
	private int idD;
	private These these;
	public Thesesoutenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Thesesoutenu(String date, String mention, int idD, These these) {
		super();
		this.date = date;
		this.mention = mention;
		this.idD = idD;
		this.these = these;
	}
	public Thesesoutenu(String date, String mention, These these) {
		super();
		this.date = date;
		this.mention = mention;
		this.these = these;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMention() {
		return mention;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	public int getIdD() {
		return idD;
	}
	public void setIdD(int idD) {
		this.idD = idD;
	}
	public These getThese() {
		return these;
	}
	public void setThese(These these) {
		this.these = these;
	}
	
	
	
	
	
}
