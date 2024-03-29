package consol;
import java.util.ArrayList;
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
	

}
