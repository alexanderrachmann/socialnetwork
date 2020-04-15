package socialnetwork;

import java.util.List;

public class UserView {
	public void printUserDetails(Integer Id, String Name, List<Integer> Friends) {
		System.out.print("Username " + Name + ". ");
		System.out.print("ID: " + Id + ". ");
		if(Friends.size() > 0) {
			System.out.print(Name + " wird gemocht von den IDs: ");
			for (Integer friend: Friends) {
				System.out.print(friend + " ");
			}
		} else
			System.out.print(Name + " wird (noch) von niemanden gemocht.");
		System.out.println();
	}
}
