package in.happycoding.model;

public class Laptop {

	private String name;
	private HardDisc disc;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, HardDisc disc) {
		super();
		this.name = name;
		this.disc = disc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HardDisc getDisc() {
		return disc;
	}

	public void setDisc(HardDisc disc) {
		this.disc = disc;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", disc=" + disc + "]";
	}

	public void start() {

		if (this.disc != null) {
			System.out.println("Starting Lappy");
		} else {
			System.out.println("No HDD Found!");
			System.out.println("Unable to Start Lappy");
		}
	}

}