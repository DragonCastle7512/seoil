//value object
public class Phonebook {
	private String name;
	private String hp;
	private String email;
	public Phonebook() {}
	public Phonebook(String name, String hp, String email) {
		super();
		this.name = name;
		this.hp = hp;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Phonebook [name=" + name + ", hp=" + hp + ", email=" + email + "]";
	}
}
