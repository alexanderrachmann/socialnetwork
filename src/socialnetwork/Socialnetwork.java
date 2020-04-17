package socialnetwork;

import com.google.gson.Gson;

public class Socialnetwork {

	public static void main(String[] args) {
		
		UserCompound Yoda = populateNetwork("Yoda");
		UserCompound Lando = populateNetwork("Lando");
		UserCompound Han = populateNetwork("Han");
		UserCompound Anakin = populateNetwork("Anakin");
		
		
		System.out.println("-------------------------------");
		System.out.println("Folgende User sind im Netzwerk.");
		Yoda.controller.updateView();
		Lando.controller.updateView();
		Han.controller.updateView();
		Anakin.controller.updateView();
		
		// Yoda likes everyone
		Lando.controller.addFriend("Yoda");
		Han.controller.addFriend("Yoda");
		Anakin.controller.addFriend("Yoda");
		// Han Solo likes Lando and otherwise. Both like Yoda
		Han.controller.addFriend("Lando");
		Lando.controller.addFriend("Han");
		Yoda.controller.addFriend("Lando");
		Yoda.controller.addFriend("Han");
		
		System.out.println("-------------------------------");
		System.out.println("Folgende User sind im Netzwerk.");
		Yoda.controller.updateView();
		Lando.controller.updateView();
		Han.controller.updateView();
		Anakin.controller.updateView();
		

		persistUser(Yoda.model);
		persistUser(Lando.model);
		persistUser(Han.model);
		persistUser(Anakin.model);
				
		
	}
	
	public static UserCompound populateNetwork(String Name) {
		UserModel model = new UserModel(Name);
		UserView view = new UserView();
		UserController controller = new UserController(model, view);
		
		return compound = UserCompound(controller, model, view); 
	}
	
	public static void persistUser(UserModel model){
		Gson gson = new Gson();
		System.out.println(gson.toJson(model));
	}
}

