package in.happycoding.model;

public class HardDisc {

	private String company;
	private String capacity;
	
	public HardDisc() {
		// TODO Auto-generated constructor stub
	}

	public HardDisc(String company, String capacity) {
		super();
		this.company = company;
		this.capacity = capacity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "HardDisc [company=" + company + ", capacity=" + capacity + "]";
	}
	
	
}