package socialnetwork;

import java.util.List;

public class UserView {
	public void printUserDetails(Integer Id, String Name, List<Integer> Friends) {
		System.out.println("---");
		System.out.println("Username und ID: " + Name + ", "+ Id);
		System.out.println("Freunde:");
		for (Integer friend: Friends) {
			System.out.println(friend);
		}
		System.out.println("---");
	}
}
