package socialnetwork;

public class UserCompound {
	public UserController controller;
	public UserModel model;
	public UserView view;
	
	public UserCompound(
			UserController controller,
			UserModel model,
			UserView view) {
		this.controller = controller;
		this.model = model;
		this.view = view;
	}
}
