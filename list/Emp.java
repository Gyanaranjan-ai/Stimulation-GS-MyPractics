package list;

public class Emp {
	private int id;
    private String name;
    private String organization;
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
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", organization=" + organization + "]";
	}
	public Emp(int id, String name, String organization) {
		super();
		this.id = id;
		this.name = name;
		this.organization = organization;
	}
    
    
    
}
