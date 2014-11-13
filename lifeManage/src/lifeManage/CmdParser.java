package lifeManage;

public class CmdParser {

	enum Commands {
		CREATE,
		DELETE,
		GET_TASKS
	}
	
	public static String ParseCommand(String[] cmd){
		switch(cmd[0]){
		case "create":
			return processCreate(cmd);
		case "getTasks":
			return processGetTasks();
		}
		return "";
		
	}
	
	
	public static String processCreate(String[] cmd){
		StringBuilder ret = new StringBuilder();
		ret.append("creating task..");
		if(cmd.length != 3){
			ret.append("incorrect number of arguments! should have 'create $name $description'");
		}else{
			LifeManager.me.createTask(cmd[1], cmd[2]);
		}
		return ret.toString();
	}
	
	public static String processGetTasks(){
		return LifeManager.me.tasksToString();
	}
	
}
