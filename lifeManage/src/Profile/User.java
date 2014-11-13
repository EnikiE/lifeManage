package Profile;

import java.util.ArrayList;
import java.util.List;

import Items.UntimedTask;


public class User {
	private List<UntimedTask> tasks;
	private String username;
	
	public User(String username){
		this.username = username;
		tasks = new ArrayList<UntimedTask>();
	}

	public void createTask(String name, String desc) {
		tasks.add(new UntimedTask(name, desc));
		// TODO Auto-generated method stub
		
	}

	public String tasksToString() {
		// TODO Auto-generated method stub
		StringBuilder ret = new StringBuilder();
		
		for(UntimedTask u : tasks){
			ret.append(u+"\n");
		}
		return ret.toString();
	}
	
}
