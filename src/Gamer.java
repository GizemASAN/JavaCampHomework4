
public class Gamer {
	
	private String firstName;
	private String lastName;
	private String id;
	private int gamerBirthYear;
	
	public Gamer(String firstName, String lastName,String id,int gamerBirthYear) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.gamerBirthYear = gamerBirthYear;
	}
	
	public Gamer() {
		
	}
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGamerBirthYear() {
		return gamerBirthYear;
	}

	public void setGamerBirthYear(int gamerBirthYear) {
		this.gamerBirthYear = gamerBirthYear;
	}
}
