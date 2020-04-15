package socialnetwork;

public class UserController {
	private UserModel model;
	private UserView view;
	
	public UserController(UserModel model, UserView view) {
		this.model = model;
		this.view = view;
	}
	
	public boolean createUser() {
		model = new UserModel(4711, "Alexander Rachmann");
		return true;
	}
	
	public boolean updateView() {
		view.printUserDetails(model.getId(), model.getName());
		return true;
	}
}
