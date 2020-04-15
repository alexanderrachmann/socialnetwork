package socialnetwork;

public class Socialnetwork {

	public static void main(String[] args) {
		
		UserModel model = retrieveUsers();
		UserView view = new UserView();
		UserController controller = new UserController(model, view);
		
		controller.updateView();
	}
	
	private static UserModel retrieveUsers() {
		UserModel usr = new UserModel(4711, "Alexander Rachmann");
		return usr;
	}

}

