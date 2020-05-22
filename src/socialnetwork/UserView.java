package socialnetwork;

import java.util.List;

public class UserView {
	public String printUserDetails(String Name, List<String> Friends) {
		String out = "";
		if(Friends.size() > 0) {
			out = Name + " wird gemocht von: ";
			for (String friend: Friends) {
				out = out + friend + " ";
			}
		} else
			out = Name + " wird (noch) von niemanden gemocht.";
		out = out + "\n";
		return out;
	}
	
	
}
