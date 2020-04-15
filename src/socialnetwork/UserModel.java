package socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
	private Integer Id;
	private String Name;
	private List<Integer> Friends = new ArrayList<Integer>();
	
	public UserModel(Integer Id, String Name) {
		setId(Id);
		setName(Name);
		Friends.add(4711);
	}
	
	private boolean setId(Integer Id) {
		this.Id = Id;
		return true;
	}
	
	public Integer getId() {
		return this.Id;
	}
		
	private boolean setName(String Name) {
		this.Name = Name;
		return true;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public boolean addFriend(Integer Friend) {
		Friends.add(Friend);
		return true;
	}
	
	public List<Integer> getFriends() {
		return this.Friends;
	}
	
}
