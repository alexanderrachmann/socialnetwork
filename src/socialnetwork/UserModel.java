package socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
	public String Name;
	public List<String> Friends = new ArrayList<String>();
	
	public UserModel(String Name) {
		setName(Name);
	}
		
	private boolean setName(String Name) {
		this.Name = Name;
		return true;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public boolean addFriend(String Friend) {
		Friends.add(Friend);
		return true;
	}
	
	public List<String> getFriends() {
		return this.Friends;
	}
	
}
