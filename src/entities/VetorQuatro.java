package entities;

public class VetorQuatro {
	public String name;
	public String email;

	public VetorQuatro(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return email;
	}

	public void seteMail(String Email) {
		this.email = Email;
	}

	public String toString() {
		return name + ", " + email;
	}

}
