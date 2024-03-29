package consol;
import java.util.ArrayList;
import java.util.Map;
public class UserManager {

	private ArrayList<User> group;
	
	public UserManager() {
		group = new ArrayList<>();
	}
	private static UserManager userManager = new UserManager();
	
	public static UserManager getUserManager() {
		return userManager;
	}
	
	// User CRUD 기능
	
	// C
	public void createUser(User user) {
		group.add(user);
	}
	
	public String getUserById(String id) {
		for(User user : group) {
			if(user.getId().equals(id))
				return "";
		}
		return id;
	}
	
	
	// R

}
