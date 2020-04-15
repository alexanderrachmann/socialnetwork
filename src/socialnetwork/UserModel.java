package socialnetwork;

public class UserModel {
	private Integer Id;
	private String Name;
	private Integer[] Friends;
	
	public UserModel(Integer Id, String Name) {
		setId(Id);
		setName(Name);
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
		//this.Friends 
		return true;
	}
	
}
