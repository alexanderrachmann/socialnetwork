package socialnetwork;

import java.io.FileWriter;

import com.google.gson.Gson;

public class Socialnetwork {

	public static void main(String[] args) {
		
		// creating Yoda
		UserModel YodaModel = new UserModel(1, "Yoda");
		UserView YodaView = new UserView();
		UserController YodaController = new UserController(YodaModel, YodaView);

		// creating Lando
		UserModel LandoModel = new UserModel(2, "Lando Calrissian");
		UserView LandoView = new UserView();
		UserController LandoController = new UserController(LandoModel, LandoView);
		
		// creating Han Solo
		UserModel HanModel = new UserModel(3, "Han Solo");
		UserView HanView = new UserView();
		UserController HanController = new UserController(HanModel, HanView);
		
		// creating Anakin
		UserModel AnakinModel = new UserModel(4, "Anakin Skywalker");
		UserView AnakinView = new UserView();
		UserController AnakinController = new UserController(AnakinModel, AnakinView);

		
		System.out.println("-------------------------------");
		System.out.println("Folgende User sind im Netzwerk.");
		YodaController.updateView();
		LandoController.updateView();
		HanController.updateView();
		AnakinController.updateView();
		
		// Yoda likes everyone
		LandoController.addFriend(1);
		HanController.addFriend(1);
		AnakinController.addFriend(1);
		// Han Solo likes Lando and otherwise. Both like Yoda
		HanController.addFriend(2);
		LandoController.addFriend(3);
		YodaController.addFriend(2);
		YodaController.addFriend(3);
		
		Gson gson = new Gson();
		gson.toJson(YodaModel, new FileWriter("yoda.json"));
		

		System.out.println("-------------------------------");
		System.out.println("Folgende User sind im Netzwerk.");
		YodaController.updateView();
		LandoController.updateView();
		HanController.updateView();
		AnakinController.updateView();
		
	}
	
}

