package consol;

public class User {
	
	private String name,id,password;
	
	public User(String name,String id,String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	@Override
	public String toString() {
		return String.format("%s) [%s/%s]",name,id,password);
	}
	
	

}
