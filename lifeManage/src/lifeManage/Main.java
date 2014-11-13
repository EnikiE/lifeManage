package lifeManage;

import java.util.Scanner;

import Profile.User;

public class Main {

	public static void main(String[] args){
		User me = new User("niki");
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			System.out.print("==> ");
			String input = in.nextLine();
			String[] cmd = input.split(" ");
			switch(cmd[0]){
			case "create":
				System.out.println("creating task..");
				if(cmd.length != 3){
					System.out.println("incorrect number of arguments! should have 'create $name $description'");
					break;
				}
				System.out.println(cmd[1]);

				System.out.println(cmd[2]);
				me.createTask(cmd[1], cmd[2]);
				break;
			
			case "getTasks":
				me.printTasks();
			
			}	
			//TODO more cases
		}
	}
}
