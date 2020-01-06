package inscrit;

public class Observation {
	private int idOb;

	private Thesedepose thesedepose;
	private String result_observation ; 
	
	public Observation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Observation(int idOb, Thesedepose thesedepose,
			String result_observation) {
		super();
		this.idOb = idOb;
		this.thesedepose = thesedepose;
		this.result_observation = result_observation;
	}

	public Observation(Thesedepose thesedepose, String result_observation) {
		super();
		this.thesedepose = thesedepose;
		this.result_observation = result_observation;
	}

	public int getIdOb() {
		return idOb;
	}

	public void setIdOb(int idOb) {
		this.idOb = idOb;
	}

	public Thesedepose getThesedepose() {
		return thesedepose;
	}

	public void setThesedepose(Thesedepose thesedepose) {
		this.thesedepose = thesedepose;
	}

	public String getResult_observation() {
		return result_observation;
	}

	public void setResult_observation(String result_observation) {
		this.result_observation = result_observation;
	}






}