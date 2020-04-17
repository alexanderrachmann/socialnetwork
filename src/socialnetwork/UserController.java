package socialnetwork;

import java.util.Map;

import com.google.gson.Gson;

public class UserController {
	public UserModel model;
	public UserView view;
	
	public UserController(UserModel model, UserView view) {
		this.model = model;
		this.view = view;
	}
	/*
	public boolean createUser() {
		model = new UserModel("Alexander Rachmann");
		return true;
	}
	*/
	public boolean addFriend(String Friend) {
		model.addFriend(Friend);
		return true;
	}
	
	public boolean endFriendship(String Foe) {
		model.endFriendship(Foe);
		return true;		
	}
	
	public boolean updateView() {
		view.printUserDetails(model.getName(), model.getFriends());
		return true;
	}
}
