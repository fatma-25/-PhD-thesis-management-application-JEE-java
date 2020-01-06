package inscrit;

public class Thesedepose {
	private int id;
	private String date;
	private These these ;
	
	
	public Thesedepose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Thesedepose(int id, String date, These these) {
		super();
		this.id = id;
		this.date = date;
		this.these = these;
	}
	public Thesedepose(String date, These these) {
		super();
		this.date = date;
		this.these = these;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public These getThese() {
		return these;
	}
	public void setThese(These these) {
		this.these = these;
	}
	





}
