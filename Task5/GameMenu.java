import java.util.ArrayList;

class GameMenu {
	
	private ArrayList <String> actions = new ArrayList<>();

	public GameMenu(ArrayList<String> actions) {

		this.actions=actions;

	}

	public void displayMenu() {
for(String action: actions){
		System.out.println(action);
	}
	public void getAction() {
System.out.println("type a number to choose an action");
for(String option: options){
	System.out.println(option)
}

	}
	}
} 

