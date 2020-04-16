package socialnetwork;

public class UserController {
	private UserModel model;
	private UserView view;
	
	public UserController(UserModel model, UserView view) {
		this.model = model;
		this.view = view;
	}
	
	public boolean createUser() {
		model = new UserModel("Alexander Rachmann");
		return true;
	}
	
	public boolean addFriend(String Friend) {
		model.addFriend(Friend);
		return true;
	}
	
	public boolean updateView() {
		view.printUserDetails(model.getName(), model.getFriends());
		return true;
	}
}
