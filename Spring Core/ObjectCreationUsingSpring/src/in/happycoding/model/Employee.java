package in.happycoding.model;

public class Employee {

	private int id;
	private String name;
	private Date birthDate;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Date birthDate) {
		
		System.out.println("Creating Employee Obj Using PC");
		
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		System.out.println("Setting BirthDate");
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}