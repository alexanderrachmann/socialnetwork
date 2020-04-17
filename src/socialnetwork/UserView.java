package socialnetwork;

import java.util.List;

public class UserView {
	public void printUserDetails(String Name, List<String> Friends) {
		if(Friends.size() > 0) {
			System.out.print(Name + " wird gemocht von: ");
			for (String friend: Friends) {
				System.out.print(friend + " ");
			}
		} else
			System.out.print(Name + " wird (noch) von niemanden gemocht.");
		System.out.println();
	}
	
}
