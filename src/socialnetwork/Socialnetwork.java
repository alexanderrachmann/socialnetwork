package socialnetwork;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

import com.google.gson.Gson;

public class Socialnetwork {

	public static void main(String[] args) {
		
		// creating Yoda
		UserModel YodaModel = new UserModel("Yoda");
		UserView YodaView = new UserView();
		UserController YodaController = new UserController(YodaModel, YodaView);

		// creating Lando
		UserModel LandoModel = new UserModel("Lando");
		UserView LandoView = new UserView();
		UserController LandoController = new UserController(LandoModel, LandoView);
		
		// creating Han Solo
		UserModel HanModel = new UserModel("Han");
		UserView HanView = new UserView();
		UserController HanController = new UserController(HanModel, HanView);
		
		// creating Anakin
		UserModel AnakinModel = new UserModel("Anakin");
		UserView AnakinView = new UserView();
		UserController AnakinController = new UserController(AnakinModel, AnakinView);

		
		System.out.println("-------------------------------");
		System.out.println("Folgende User sind im Netzwerk.");
		YodaController.updateView();
		LandoController.updateView();
		HanController.updateView();
		AnakinController.updateView();
		
		// Yoda likes everyone
		LandoController.addFriend("Yoda");
		HanController.addFriend("Yoda");
		AnakinController.addFriend("Yoda");
		// Han Solo likes Lando and otherwise. Both like Yoda
		HanController.addFriend("Lando");
		LandoController.addFriend("Han");
		YodaController.addFriend("Lando");
		YodaController.addFriend("Han");
		
		System.out.println("-------------------------------");
		System.out.println("Folgende User sind im Netzwerk.");
		YodaController.updateView();
		LandoController.updateView();
		HanController.updateView();
		AnakinController.updateView();
		

		persistUser(YodaModel);
		persistUser(LandoModel);
		persistUser(HanModel);
		persistUser(AnakinModel);
				
		
	}
	
	public static void persistUser(UserModel model){
		Gson gson = new Gson();
		System.out.println(gson.toJson(model));
	}
}

