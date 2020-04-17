package socialnetwork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class Socialnetwork {
		
	public static void main(String[] args) {
		
		Map<String, UserCompound> UserDatabase = 
				new HashMap<String, UserCompound>();
		
		reviveUsers();
		
		UserDatabase.put("Yoda", populateNetwork("Yoda"));
		UserDatabase.put("Lando", populateNetwork("Lando"));
		UserDatabase.put("Han", populateNetwork("Han"));
		UserDatabase.put("Anakin", populateNetwork("Anakin"));
				
		// Yoda likes everyone
		UserDatabase.get("Lando").controller.addFriend("Yoda");
		UserDatabase.get("Han").controller.addFriend("Yoda");
		UserDatabase.get("Anakin").controller.addFriend("Yoda");
				
		// Han Solo likes Lando and otherwise. Both like Yoda
		UserDatabase.get("Han").controller.addFriend("Lando");
		UserDatabase.get("Lando").controller.addFriend("Han");
		UserDatabase.get("Yoda").controller.addFriend("Lando");
		UserDatabase.get("Yoda").controller.addFriend("Han");
		
		showNetwork(UserDatabase);	

		buryUsers(UserDatabase);			
		
	}
	
	public static UserCompound populateNetwork(String Name) {
		UserModel model = new UserModel(Name);
		UserView view = new UserView();
		UserController controller = new UserController(model, view);
		
		UserCompound compound = 
				new UserCompound(controller, model, view);
		return compound;
	}
	
	public static void showNetwork(Map<String, UserCompound> UserDatabase) {
		System.out.println("-------------------------------");
		System.out.println("Übersicht über das Netzwerk.");
		
		UserDatabase.get("Yoda").controller.updateView();
		UserDatabase.get("Lando").controller.updateView();
		UserDatabase.get("Han").controller.updateView();
		UserDatabase.get("Anakin").controller.updateView();
	}
	
	public static void buryUsers
		(Map<String, UserCompound> UserDatabase) {
		
		Gson gson = new Gson();
		
		try {
			File file = new File("UserDatabase.json");
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write(gson.toJson(UserDatabase)); 
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void reviveUsers(){
		
	}
}

