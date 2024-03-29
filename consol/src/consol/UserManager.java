package consol;
import java.util.ArrayList;
public class UserManager {

	private ArrayList<User> group;
	
	public UserManager() {
		group = new ArrayList<>();
	}
	public static UserManager userManager = new UserManager();
	
	private static UserManager getUserManager() {
		return userManager;
	}
	
	// User CRUD 기능

}
